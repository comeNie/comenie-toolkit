/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: comNie
 * @since: 2016/2/25
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.comenie.toolkit.remoting"})
public class Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Appliction.class);
    }
}

