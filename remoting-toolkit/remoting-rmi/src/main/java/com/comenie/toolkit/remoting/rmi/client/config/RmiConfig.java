/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.rmi.client.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;


/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
public class RmiConfig {


    @Bean(name = "remotingRmiAccountService")
    public RmiProxyFactoryBean getRmiProxyFactoryBean(){
       RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://192.168.1.16:1199/remoting/rmi/AccountService");
        rmiProxyFactoryBean.setServiceInterface(AccountService.class);
        return  rmiProxyFactoryBean;
    }

}
