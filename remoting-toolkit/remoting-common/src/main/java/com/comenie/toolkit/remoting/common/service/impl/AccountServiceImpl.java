/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.common.service.impl;

import com.comenie.toolkit.remoting.common.dto.Account;
import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Service
public class AccountServiceImpl implements AccountService {
    private Map<String, List<Account>> accountMap = new ConcurrentHashMap<String, List<Account>>();

    @Override
    public void insertAccount(Account account) {
        String name = account.getName();
        synchronized (accountMap) {
            List<Account> accountList = accountMap.get(name);
            if (accountList == null) {
                accountList = new ArrayList<Account>();
                accountMap.put(name, accountList);
            }
            accountList.add(account);
        }


    }

    @Override
    public List<Account> getAccounts(String name) {
        return accountMap.get(name);
    }

    @Override
    public List<Account> getAllAccounts() {
        List<Account> allAccounts = new ArrayList<Account>();
        synchronized (accountMap) {
            for (List<Account> accounts : accountMap.values()) {
                allAccounts.addAll(accounts);
            }
        }
        return allAccounts;
    }

}
