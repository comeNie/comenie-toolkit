package com.comenie.toolkit.core.codec.support;


import com.comenie.toolkit.core.codec.Decoder;
import com.comenie.toolkit.core.codec.DecoderException;
import com.comenie.toolkit.core.codec.Encoder;
import com.comenie.toolkit.core.codec.EncoderException;

/**
 * URL编码和解码器。处理byte[]到byte[]类型。
 * 
 * @author Daniel Li
 * @since 18 Jun 2013
 * @see Encoder
 * @see Decoder
 */
public class URLCodec implements Encoder<byte[], byte[]>, Decoder<byte[], byte[]> {

	@Override
	public byte[] decode(byte[] source) throws DecoderException {
		try {
			return org.apache.commons.codec.net.URLCodec.decodeUrl(source);
		} catch (Exception e) {
			throw new DecoderException(e.getMessage(), e);
		}
	}

	@Override
	public byte[] encode(byte[] source) throws EncoderException {
		try {
			return org.apache.commons.codec.net.URLCodec.encodeUrl(null, source);
		} catch (Exception e) {
			throw new EncoderException(e.getMessage(), e);
		}
	}

}
