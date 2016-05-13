/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.metaq_learn.message.bean;

import java.io.Serializable;

/**
 * @author: comNie
 * @since: 2016/5/13
 */
public class EscrowMessageBean implements Serializable {

    private static final long serialVersionUID = 7906043645837904188L;

    /**
     * 业务系统
     */
    private String businessId;
    /**
     * 业务类型
     */
    private String businessType;
    /**
     * 消息类型
     */
    private String messageType;
    /**
     * 消息内容
     */
    private String content;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
