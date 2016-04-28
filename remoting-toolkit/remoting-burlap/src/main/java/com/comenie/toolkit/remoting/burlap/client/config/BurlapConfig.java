/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.burlap.client.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;


/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
public class BurlapConfig {


    @Bean(name = "remotingBurlapAccountService")
    public BurlapProxyFactoryBean getBurlapProxyFactoryBean(){
        BurlapProxyFactoryBean burlapProxyFactoryBean = new BurlapProxyFactoryBean();
        burlapProxyFactoryBean.setServiceInterface(AccountService.class);
        burlapProxyFactoryBean.setServiceUrl("http://192.168.1.16:40000/remoting/burlap/AccountService");
        return burlapProxyFactoryBean;
    }

}
