/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.context.dfs;

import org.springframework.core.NestedRuntimeException;

/**
 * 分布式文件系统异常
 * @author: comNie
 * @since: 2016/2/22
 * @see NestedRuntimeException
 */
public class DistributedFileSystemException extends NestedRuntimeException{

    private static final long serialVersionUID = -5363328862858087052L;

    public DistributedFileSystemException(String message) {
        super(message);
    }

    public DistributedFileSystemException(String message, Throwable cause) {
        super(message, cause);
    }



}
