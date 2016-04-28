/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server.httpinvoker.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
public class HttpInvokerConfig {

    @Bean(name = "/remoting/httpinvoker/AccountService")
    public HttpInvokerServiceExporter getHttpInvokerServiceExporter(AccountService accountService){
        HttpInvokerServiceExporter httpInvokerServiceExporter =  new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setServiceInterface(AccountService.class);
        httpInvokerServiceExporter.setService(accountService);
        return  httpInvokerServiceExporter;
    }

}
