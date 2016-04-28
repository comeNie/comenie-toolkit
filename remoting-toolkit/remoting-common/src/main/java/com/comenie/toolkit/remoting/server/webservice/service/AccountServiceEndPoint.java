/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server.webservice.service;

import com.comenie.toolkit.remoting.common.dto.Account;
import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author: comNie
 * @since: 2016/2/28
 */
@WebService(serviceName = "/accountService")
public class AccountServiceEndPoint extends SpringBeanAutowiringSupport{

    @Autowired
    private AccountService accountService;

    @WebMethod
    public void insertAccount(Account account) {
        accountService.insertAccount(account);
    }

    @WebMethod
    public List<Account> getAccounts(String name) {
        return accountService.getAccounts(name);
    }

    @WebMethod
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}
