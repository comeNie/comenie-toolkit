/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.core.compression;

import org.springframework.core.NestedRuntimeException;

/**
 * 解压缩异常。
 * @author: comNie
 * @since: 2016/5/9
 * @see NestedRuntimeException
 */
public class DecompressorException extends NestedRuntimeException {
    public DecompressorException(String msg) {
        super(msg);
    }

    public DecompressorException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
