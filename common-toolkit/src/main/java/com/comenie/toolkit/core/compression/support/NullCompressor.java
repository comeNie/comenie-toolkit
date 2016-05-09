/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.core.compression.support;

import com.comenie.toolkit.core.compression.Compressor;
import com.comenie.toolkit.core.compression.CompressorException;
import com.comenie.toolkit.core.compression.Decompressor;
import com.comenie.toolkit.core.compression.DecompressorException;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 空实现
 * @author: comNie
 * @since: 2016/5/9
 */
public class NullCompressor implements Compressor<byte[],byte[]>,Decompressor<byte[],byte[]> {
    public static final NullCompressor COMPRESSOR = new NullCompressor();

    private NullCompressor() {
    }

    @Override
    public byte[] compress(byte[] source) throws CompressorException {
        return source;
    }

    @Override
    public OutputStream wrapper(OutputStream sourceOutputStream) throws CompressorException {
        return sourceOutputStream;
    }

    @Override
    public byte[] decompress(byte[] source) throws DecompressorException {
        return source;
    }

    @Override
    public InputStream wrapper(InputStream sourceInputStream) throws DecompressorException {
        return sourceInputStream;
    }
}
