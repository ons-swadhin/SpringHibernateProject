package com.cg.abstractfactory.design.pattern.test;

import com.cg.model.test.Computer;
import com.cg.model.test.PC;

public class PCFactory implements ComputerAbstractFactory {
	private String RAM;
	private String HDD;
	private String CPU;

	@Override
	public Computer createComputer() {
		return new PC(this.RAM,this.HDD,this.CPU);
	}
	
	
	public PCFactory(String ram,String hdd,String cpu)
	{
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}

}
