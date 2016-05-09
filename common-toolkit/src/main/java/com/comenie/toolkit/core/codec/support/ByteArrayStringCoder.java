package com.comenie.toolkit.core.codec.support;


import com.comenie.toolkit.core.codec.DecoderException;
import com.comenie.toolkit.core.codec.EncoderException;

/**
 * 处理{@link String}到{@link byte[]}类型的编码和解码器。
 * 
 * @author Daniel Li
 * @since 18 Jun 2013
 * @see AbstractCoder
 */
public class ByteArrayStringCoder extends AbstractCoder<byte[], String, byte[], char[]> {

	@Override
	public String encode(byte[] source) throws EncoderException {
		return new String(innerEncode(source));
	}

	@Override
	public byte[] decode(String source) throws DecoderException {
		return innerDecode(source.toCharArray());
	}

}
