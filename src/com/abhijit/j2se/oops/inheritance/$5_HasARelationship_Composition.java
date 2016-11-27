package com.abhijit.j2se.oops.inheritance;

public class $5_HasARelationship_Composition {
/**
 * Strong Association
 * 
 */
	public static void main(String[] args) {
			Computer com = new Computer();
			System.out.println("\nBrowing the internet...");
	        System.out.println("Writing some source code...");
	        System.out.println("Saving work...\n");
			com.allDone();
			com=null;
	}
}

class Computer{
	
	private OS os = new OS();
	private PowerSupply ps = new PowerSupply();
	
	Computer(){
		ps.powerOn();
		os.bootUp();
	}
	
	void allDone(){
		os.shutDown();
		ps.powerOff();
	}
}

class OS{
	void bootUp(){
		System.out.println("OS is booting up...");
	}
	void shutDown(){
		System.out.println("OS is Shutting down...");
	}
}
class PowerSupply{
	 void powerOn(){
			System.out.println("Powering on...");

	 }
	 void powerOff(){
			System.out.println("Powering off...");

	 }
}

