/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.common.service;

import com.comenie.toolkit.remoting.common.dto.Account;

import java.util.List;

/**
 * @author: comNie
 * @since: 2016/2/25
 */
public interface AccountService {
    void insertAccount(Account account);

    List<Account> getAccounts(String name);

    List<Account> getAllAccounts();
}
