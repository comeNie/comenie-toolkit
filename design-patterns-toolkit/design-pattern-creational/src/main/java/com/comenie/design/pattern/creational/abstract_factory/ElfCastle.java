package com.comenie.design.pattern.creational.abstract_factory;

/**
 * 
 * ElfCastle
 *
 */
public class ElfCastle implements Castle {

	static final String DESCRIPTION = "This is the Elven castle!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
