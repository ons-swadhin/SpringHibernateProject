package com.cg.abstractfactory.design.pattern.test;

import com.cg.model.test.Computer;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}

}
