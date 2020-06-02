package com.cg.simplefactory.design.pattern.test;

import com.cg.model.test.CompuetTypeEnum;
import com.cg.model.test.Computer;
import com.cg.model.test.PC;
import com.cg.model.test.Server;

public class ComputerFactory {

	public static Computer getComputer(CompuetTypeEnum type, String ram, String hdd, String cpu) {

		Computer comp = null;

		switch (type) {
		case PC:
			comp = new PC(ram, hdd, cpu);
			break;

		case SERVER:
			comp = new Server(ram, hdd, cpu);
			break;

		}

		return comp;
	}
}