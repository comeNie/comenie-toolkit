package com.comenie.design.pattern.creational.abstract_factory;

/**
 * 
 * ElfArmy
 *
 */
public class ElfArmy implements Army {

	static final String DESCRIPTION = "This is the Elven Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
