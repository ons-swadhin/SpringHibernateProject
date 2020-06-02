package com.cg.builder.design.pattern.test;

public class Computer {

	
	private String RAM;
	private String HDD;
	private String CPU;

	// Optional parameter
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	private double weight;
	
	
	private Computer(Builder builder) {
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.CPU = builder.CPU;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.weight = builder.weight;
	}

	public String getRAM() {
		return RAM;
	}

	public double getWeight() {
		return weight;
	}

	public String getHDD() {
		return HDD;
	}

	public String getCPU() {
		return CPU;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + ", weight=" + weight + "]";
	}




	public static class Builder {
		private String RAM;
		private String HDD;
		private String CPU;
		

		
		// Optional parameter
		private boolean isGraphicsCardEnabled;

		private boolean isBluetoothEnabled;
		
		private double weight;
		
		public Builder(String ram, String hdd, String cpu) {
			this.RAM = ram;
			this.HDD = hdd;
			this.CPU = cpu;
		}

		public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public Builder setWeight(double weight) {
			this.weight = weight;
			return this;
		}

		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
