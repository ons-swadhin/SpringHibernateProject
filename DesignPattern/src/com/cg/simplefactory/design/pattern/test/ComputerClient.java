package com.cg.simplefactory.design.pattern.test;

import com.cg.model.test.CompuetTypeEnum;
import com.cg.model.test.Computer;
import com.cg.simplefactory.design.pattern.test.ComputerFactory;

public class ComputerClient {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(CompuetTypeEnum.PC, "2 GB", "500 GB", "2.4 GHz");

		Computer server = ComputerFactory.getComputer(CompuetTypeEnum.SERVER, "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}

}
