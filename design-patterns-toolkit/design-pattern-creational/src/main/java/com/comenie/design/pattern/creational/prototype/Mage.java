package com.comenie.design.pattern.creational.prototype;

/**
 * 
 * Mage
 *
 */
public abstract class Mage extends Prototype {

	@Override
	public abstract Mage clone() throws CloneNotSupportedException;

}
