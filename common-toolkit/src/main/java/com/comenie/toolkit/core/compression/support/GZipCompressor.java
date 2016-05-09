/*
* Copyright (c) 2015 comNie. All Rights Reserved.
*/
package com.comenie.toolkit.core.compression.support;

import com.comenie.toolkit.core.compression.Compressor;
import com.comenie.toolkit.core.compression.CompressorException;
import com.comenie.toolkit.core.compression.Decompressor;
import com.comenie.toolkit.core.compression.DecompressorException;
import com.comenie.toolkit.core.util.io.IOUtils;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * 空实现
 * @author: comNie
 * @since: 2016/5/9
 */
public class GZipCompressor implements Compressor<byte[],byte[]>,Decompressor<byte[],byte[]> {

    @Override
    public byte[] compress(byte[] source) throws CompressorException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = null;
        try {
            gzipOutputStream = new GZIPOutputStream(outputStream);
            gzipOutputStream.write(source);
        } catch (IOException e) {
            throw  new CompressorException(e.getMessage(),e);
        }
        finally {
            IOUtils.closeQuietly(gzipOutputStream);
        }
        return outputStream.toByteArray();
    }

    @Override
    public OutputStream wrapper(OutputStream sourceOutputStream) throws CompressorException {
        try {
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(sourceOutputStream);
            return gzipOutputStream;
        } catch (Exception e) {
            throw new CompressorException(e.getMessage(), e);
        }
    }

    @Override
    public byte[] decompress(byte[] source) throws DecompressorException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(source);
        GZIPInputStream gzipInputStream = null;
        try {
            gzipInputStream = new GZIPInputStream(inputStream);
            return IOUtils.toByteArray(gzipInputStream);
        } catch (Exception e) {
            throw new CompressorException(e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(gzipInputStream);
        }
    }

    @Override
    public InputStream wrapper(InputStream sourceInputStream) throws DecompressorException {
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(sourceInputStream);
            return gzipInputStream;
        } catch (Exception e) {
            throw new CompressorException(e.getMessage(), e);
        }
    }
}
