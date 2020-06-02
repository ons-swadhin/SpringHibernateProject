package com.cg.abstractfactory.design.pattern.client.test;

import com.cg.model.test.Computer;
import com.cg.model.test.Server;
import com.cg.abstractfactory.design.pattern.test.ComputerFactory;
import com.cg.abstractfactory.design.pattern.test.PCFactory;
import com.cg.abstractfactory.design.pattern.test.ServerFactory;
public class ComputerClient {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB", "500 GB", "2.4 GHz"));
	}

}
