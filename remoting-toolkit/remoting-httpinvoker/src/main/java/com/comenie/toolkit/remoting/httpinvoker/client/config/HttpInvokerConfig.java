/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.httpinvoker.client.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpComponentsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;


/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
public class HttpInvokerConfig {

    @Bean(name = "httpClientRequestExecutor")
    public HttpComponentsHttpInvokerRequestExecutor getHttpComponentsHttpInvokerRequestExecutor(){
        return  new HttpComponentsHttpInvokerRequestExecutor();
    }

    @Bean(name = "remotingHttpInvokerAccountService")
    public HttpInvokerProxyFactoryBean getHttpInvokerProxyFactoryBean(HttpComponentsHttpInvokerRequestExecutor httpComponentsHttpInvokerRequestExecutor){
        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();
        httpInvokerProxyFactoryBean.setServiceUrl("http://127.0.0.1:40000/remoting/httpinvoker/AccountService");
        httpInvokerProxyFactoryBean.setHttpInvokerRequestExecutor(httpComponentsHttpInvokerRequestExecutor);
        httpInvokerProxyFactoryBean.setServiceInterface(AccountService.class);
        return  httpInvokerProxyFactoryBean;
    }

}
