/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server.rmi.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author: comNie
 * @since: 2016/2/26
 */
@Configuration
public class RmiConfig {

    @Bean
    public RmiServiceExporter getRmiServiceExporter(AccountService accountService){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(accountService);
        rmiServiceExporter.setServiceInterface(AccountService.class);
        rmiServiceExporter.setRegistryPort(1199);
        rmiServiceExporter.setServiceName("remoting/rmi/AccountService");
        return rmiServiceExporter;
    }

}
