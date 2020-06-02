package com.cg.builder.design.pattern.test;

public class ComputerBuilderClient {

	public static void main(String[] args) {
		Computer computer = new Computer.Builder("2 GB", "500 GB", "2.4 GHz").build();

		Computer computer1 = new Computer.Builder("2 GB", "500 GB", "2.4 GHz")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		Computer computer2 = new Computer.Builder("2 GB", "500 GB", "2.4 GHz")
				.setWeight(1.5).build();
		System.out.println(computer);
		System.out.println(computer1);
		System.out.println(computer2);
	}

}
