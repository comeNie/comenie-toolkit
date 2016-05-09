package com.comenie.toolkit.core.codec.support;

import com.comenie.toolkit.core.codec.DecoderException;
import com.comenie.toolkit.core.codec.EncoderException;
import com.comenie.toolkit.core.util.StringUtils;

/**
 * 处理{@link String}到{@link String}类型的编码和解码器,UTF-8编码
 *
 * @author Daniel Li
 * @since 18 Jun 2013
 * @see AbstractCoder
 */
public class StringStringCoder extends AbstractCoder<String, String, byte[], byte[]> {

	@Override
	public String encode(String source) throws EncoderException {
		return StringUtils.newStringUtf8(innerEncode(StringUtils.getBytesUtf8(source)));
	}

	@Override
	public String decode(String source) throws DecoderException {
		return StringUtils.newStringUtf8(innerDecode(StringUtils.getBytesUtf8(source)));
	}
}
