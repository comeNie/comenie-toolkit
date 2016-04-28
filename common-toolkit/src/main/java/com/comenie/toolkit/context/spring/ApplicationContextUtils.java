/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.context.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: comNie
 * @since: 2016/2/26
 */
public class ApplicationContextUtils  implements ApplicationContextAware{

    private  static  ApplicationContext applicationContext = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtils.applicationContext = applicationContext;
    }

    /**
     * 获取Spring 容器
     * @return
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

}
