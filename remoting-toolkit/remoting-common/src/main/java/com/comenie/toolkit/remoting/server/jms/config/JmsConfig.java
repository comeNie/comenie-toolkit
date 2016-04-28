/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server.jms.config;

import com.comenie.toolkit.remoting.common.service.AccountService;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.SimpleMessageListenerContainer;
import org.springframework.jms.remoting.JmsInvokerServiceExporter;

/**
 * @author: comNie
 * @since: 2016/2/28
 */
@Configuration
public class JmsConfig {

    @Bean
    public JmsInvokerServiceExporter getJmsInvokerServiceExporter(AccountService accountService){
        JmsInvokerServiceExporter jmsInvokerServiceExporter = new JmsInvokerServiceExporter();
        jmsInvokerServiceExporter.setService(accountService);
        jmsInvokerServiceExporter.setServiceInterface(AccountService.class);
        return  jmsInvokerServiceExporter;
    }

    @Bean
    public SimpleMessageListenerContainer getSimpleMessageListenerContainer(JmsInvokerServiceExporter jmsInvokerServiceExporter,
                                                                            ActiveMQConnectionFactory activeMQConnectionFactory,
                                                                            ActiveMQQueue activeMQQueue){
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(activeMQConnectionFactory);
        simpleMessageListenerContainer.setMessageListener(jmsInvokerServiceExporter);
        simpleMessageListenerContainer.setDestination(activeMQQueue);
        return  simpleMessageListenerContainer;
    }


}
