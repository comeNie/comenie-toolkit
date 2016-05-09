/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.core.compression;

import org.springframework.core.NestedRuntimeException;

/**
 * 压缩异常
 * @author: comNie
 * @since: 2016/5/9
 */
public class CompressorException  extends NestedRuntimeException {

    private static final long serialVersionUID = 8862452193888553128L;

    public CompressorException(String msg) {
        super(msg);
    }

    public CompressorException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
