package com.comenie.toolkit.core.compression.support;


import com.comenie.toolkit.core.compression.Compressor;
import com.comenie.toolkit.core.compression.CompressorException;
import com.comenie.toolkit.core.compression.Decompressor;
import com.comenie.toolkit.core.compression.DecompressorException;
import org.xerial.snappy.Snappy;
import org.xerial.snappy.SnappyInputStream;
import org.xerial.snappy.SnappyOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Snappy压缩和解压缩器。处理byte[]到byte[]类型。
 *
 * @author: comNie
 * @since: 2016/5/9
 * @see Compressor
 * @see Decompressor
 */
public class SnappyJavaCompressor implements Compressor<byte[], byte[]>, Decompressor<byte[], byte[]> {

	public static final SnappyJavaCompressor COMPRESSOR = new SnappyJavaCompressor();
	
	private SnappyJavaCompressor() {
	}
	
	@Override
	public byte[] decompress(byte[] source) throws DecompressorException {
		try {
			return Snappy.uncompress(source);
		} catch (IOException e) {
			throw new DecompressorException(e.getMessage(), e);
		}
	}

	@Override
	public InputStream wrapper(InputStream sourceInputStream) throws DecompressorException {
		try {
			SnappyInputStream snappyInputStream = new SnappyInputStream(sourceInputStream);
			return snappyInputStream;
		} catch (Exception e) {
			throw new DecompressorException(e.getMessage(), e);
		}
	}

	@Override
	public byte[] compress(byte[] source) throws CompressorException {
		try {
			return Snappy.compress(source);
		} catch (IOException e) {
			throw new CompressorException(e.getMessage(), e);
		}
	}

	@Override
	public OutputStream wrapper(OutputStream sourceOutputStream) throws CompressorException {
		try {
			SnappyOutputStream snappyOutputStream = new SnappyOutputStream(sourceOutputStream);
			return snappyOutputStream;
		} catch (Exception e) {
			throw new CompressorException(e.getMessage(), e);
		}
	}

}
