/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.jms.client.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.remoting.JmsInvokerProxyFactoryBean;


/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
public class JmsConfig {

    @Bean(name = "remotingJmsAccountService")
    public JmsInvokerProxyFactoryBean getJmsInvokerProxyFactoryBean(ActiveMQConnectionFactory activeMQConnectionFactory,
                                                                    ActiveMQQueue activeMQQueue){
        JmsInvokerProxyFactoryBean jmsInvokerProxyFactoryBean = new JmsInvokerProxyFactoryBean();
        jmsInvokerProxyFactoryBean.setConnectionFactory(activeMQConnectionFactory);
        jmsInvokerProxyFactoryBean.setQueue(activeMQQueue);
        jmsInvokerProxyFactoryBean.setServiceInterface(AccountService.class);
        return  jmsInvokerProxyFactoryBean;
    }

}
