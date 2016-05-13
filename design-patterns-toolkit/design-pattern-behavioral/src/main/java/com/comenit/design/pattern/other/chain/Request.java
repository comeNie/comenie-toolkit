/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenit.design.pattern.other.chain;

/**
 * @author: comNie
 * @since: 2016/5/10
 */
public class Request {

    private String requestDescription;

    private RequestType requestType;

    public Request(RequestType requestType, String requestDescription) {
        this.requestDescription = requestDescription;
        this.requestType = requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

}
