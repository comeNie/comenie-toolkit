/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server.burlap.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapServiceExporter;

/**
 * @author: comNie
 * @since: 2016/2/28
 */
@Configuration
public class BurlapConfig {

    @Bean(name = "/remoting/burlap/AccountService")
    public BurlapServiceExporter getBurlapServiceExporter(AccountService accountService){
        BurlapServiceExporter burlapServiceExporter = new BurlapServiceExporter();
        burlapServiceExporter.setService(accountService);
        burlapServiceExporter.setServiceInterface(AccountService.class);
        return burlapServiceExporter;
    }
}
