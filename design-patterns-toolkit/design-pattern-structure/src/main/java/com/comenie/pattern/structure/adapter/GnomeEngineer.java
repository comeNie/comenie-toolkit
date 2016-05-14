package com.comenie.pattern.structure.adapter;

/**
 * 
 * Adapter class. Adapts the interface of the device ({@link GoblinGlider}) into
 * {@link Engineer} interface expected by the client ({@link GnomeEngineeringManager}).
 * 
 */
public class GnomeEngineer implements Engineer {

	private GoblinGlider glider;

	public GnomeEngineer() {
		glider = new GoblinGlider();
	}

	public void operateDevice() {
		glider.attachGlider();
		glider.gainSpeed();
		glider.takeOff();
	}

}
