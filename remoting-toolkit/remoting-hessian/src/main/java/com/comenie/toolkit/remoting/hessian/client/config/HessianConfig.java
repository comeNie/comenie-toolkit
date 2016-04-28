/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.hessian.client.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;


/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
public class HessianConfig {


    @Bean(name = "remotingHessianAccountService")
    public HessianProxyFactoryBean getHessianProxyFactoryBean(){
        HessianProxyFactoryBean  hessianProxyFactoryBean = new HessianProxyFactoryBean();
        hessianProxyFactoryBean.setServiceInterface(AccountService.class);
        hessianProxyFactoryBean.setServiceUrl("http://192.168.1.16:40000/remoting/hessian/AccountService");
        return  hessianProxyFactoryBean;
    }

}
