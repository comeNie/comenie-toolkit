package com.comenie.design.pattern.creational.prototype;

/**
 * 
 * Beast
 *
 */
public abstract class Beast extends Prototype {

	@Override
	public abstract Beast clone() throws CloneNotSupportedException;

}
