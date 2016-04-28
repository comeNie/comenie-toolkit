/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.context.dfs.fastdfs.support;

import org.csource.fastdfs.ClientGlobal;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

/**
 * 客户端配置初始化器。
 * @author: comNie
 * @since: 2016/2/22
 */
public class ClientGlobalInitializer implements InitializingBean {


    private Resource configResource;

    /**
     * 设置客户端配置资源
     * @param configResource 客户端配置资源
     */
    public void setConfigResource(Resource configResource){
        this.configResource = configResource;
    }

    /**
     * 初始化客户端配置文件
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        ClientGlobal.init(configResource.getFile().getAbsolutePath());
    }
}
