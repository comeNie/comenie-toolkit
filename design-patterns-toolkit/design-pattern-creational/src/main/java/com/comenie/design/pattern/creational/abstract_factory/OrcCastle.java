package com.comenie.design.pattern.creational.abstract_factory;

/**
 * 
 * OrcCastle
 *
 */
public class OrcCastle implements Castle {

	static final String DESCRIPTION = "This is the Orc castle!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
