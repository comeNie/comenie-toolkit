/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.remoting.common.dto;

import java.io.Serializable;

/**
 * @author: comNie
 * @since: 2016/2/25
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 2718159871145819262L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
