package org.tnsif.builder;

public class Laptop  {
	
	//Required Fields
	private String ram;
	private String hdd;
	private String cpu;
	
	//Optional Fields
	private boolean isGraphicsEnable;
	private boolean isBluetoothEnable;
	
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isGraphicsEnable() {
		return isGraphicsEnable;
	}
	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}
	
	/*Make private constructor of Laptop(outer class)
	 * so that direct object creation can be prevented
	 * and Object can be created only by calling
	 *LaptopBuilder:build()
	 *Initialize all instance variables of 
	 *Laptop(outer class) from LaptopBuilder
	 */
	private Laptop(LaptopBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		
		this.isBluetoothEnable = builder.isBluetoothEnable;
		this.isGraphicsEnable = builder.isGraphicsEnable;
		
	}
	
	/**
	 * Internal class LaptopBuilder, which has
	 * public constructor to initializes required/Mandatory fields
	 * and we have setter methods for all Optional fields
	 * which returns LaptopBuilder itself.
	 * @author KK JavaTutorials
	 */
	public static class LaptopBuilder{
		
		//Required Fields
		private String ram;
		private String hdd;
		private String cpu;
		
		//Optional Fields
		private boolean isGraphicsEnable;
		private boolean isBluetoothEnable;
		
		public LaptopBuilder(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}
 
		public LaptopBuilder setGraphicsEnable(boolean isGraphicsEnable) {
			this.isGraphicsEnable = isGraphicsEnable;
			return this;
		}
 
		public LaptopBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}
	
		/*Only one way to create Laptop Object
		 * by calling LaptopBuilder:build()
		*/
		public Laptop build() {
			return new Laptop(this);
		}
	}
 
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnable=" + isGraphicsEnable
				+ ", isBluetoothEnable=" + isBluetoothEnable + "]";
	}
	
}
