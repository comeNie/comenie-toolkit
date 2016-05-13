/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenit.design.pattern.other.chain;

/**
 * @author: comNie
 * @since: 2016/5/10
 */
public  abstract  class RequestHandler {


    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request){
        if(null != request){
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this + " handling request \"" + req + "\"");
    }

}
