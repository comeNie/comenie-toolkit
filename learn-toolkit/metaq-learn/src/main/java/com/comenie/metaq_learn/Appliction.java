/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.metaq_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: comNie
 * @since: 2016/5/13
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Appliction.class);
    }
}

