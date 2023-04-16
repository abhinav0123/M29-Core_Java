package org.tnsif.factorypattern;


	public class ClientTest {
		 
		public static void main(String[] args) {
			
			//Create Computer with different configurations
			Computer pc = ComputerFactory.getComputer(ComputerType.PC, "16 GB", "120 GB", "2,23 HGZ", true, true);
			System.out.println("PC Config::"+pc);
			
			Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "32 GB", "320 GB", "2,29 HGZ", true, true);
			System.out.println("Server Config::"+server);
			
			Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16 GB", "140 GB", "2,23 HGZ", true, true);
			System.out.println("Laptop Config::"+laptop);
		}
	 
	}


