/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server.hessian.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * @author: comNie
 * @since: 2016/2/28
 */
@Configuration
public class HessianConfig {

    @Bean(name = "/remoting/hessian/AccountService")
    public HessianServiceExporter getHessianServiceExporter(AccountService accountService){
        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
        hessianServiceExporter.setService(accountService);
        hessianServiceExporter.setServiceInterface(AccountService.class);
        return  hessianServiceExporter;
    }
}
