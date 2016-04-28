/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.httpinvoker.client.controller;

import com.comenie.toolkit.remoting.common.dto.Account;
import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Controller
@RequestMapping("/test")
public class AccountController {
    @Resource(name = "remotingHttpInvokerAccountService")
    public AccountService accountService;



    @RequestMapping(value = "/add", method = { RequestMethod.GET })
    public @ResponseBody Object toInsertAccount() {
        return "account_add";
    }

    @RequestMapping(value = "/add/2",method = { RequestMethod.GET })
    public  @ResponseBody Object doInsertAccount() {
        Account account = new Account();
        account.setName("test");
        accountService.insertAccount(account);
        return account;
    }

    @RequestMapping(value = "/add/3",method = { RequestMethod.GET })
    public  @ResponseBody Object getAccounts() {
        return accountService.getAllAccounts();
    }
}
