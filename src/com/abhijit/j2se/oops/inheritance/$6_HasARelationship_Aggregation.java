package com.abhijit.j2se.oops.inheritance;

public class $6_HasARelationship_Aggregation {
/**
 * Mobile Bluetooth obeject, Car Bluetooth object, Home PC Bluetooth Object
 * Here you can use your mobile bluetooth in car and Home PC as well
 * So, it doesn't mean that if the car is no longer exist, your mobile bluetooth is worthless. You can still use in your Home PC
 * i.e It is an weak association which is nothing Aggregation
 */
	
	public static void main(String[] args) {
		MobileBluetooth mb = new MobileBluetooth(true);
		Car car = new Car("Hiphop music",mb);
		String carClazz = car.getClass().getName();
		System.out.println(car + " in "+carClazz);
		
		HomePC pc = new HomePC("Classic music",mb);
		String pcClazz = pc.getClass().getName();
		System.out.println(pc + " in "+pcClazz);
		
		Laptop laptop = new Laptop("Jazz music",mb);
		String laptopClazz = laptop.getClass().getName();
		System.out.println(laptop + " in "+laptopClazz);
		
	}
	
}
class MobileBluetooth{
	private boolean bluetooth;
	
	MobileBluetooth(boolean bluetooth){
		this.bluetooth=bluetooth;
	}
}
class Car{
	private MobileBluetooth mobileBluetooth;
	private String music;
	Car c;
	Car(String music, MobileBluetooth mobileBluetooth){
		this.mobileBluetooth = mobileBluetooth;
		this.music=music;
	}
	public String toString(){
				
		return music+" is playing ";
	}
}
class HomePC{
	private MobileBluetooth mobileBluetooth;
	private String music;
	HomePC(String music, MobileBluetooth mobileBluetooth){
		this.mobileBluetooth = mobileBluetooth;
		this.music=music;
	}
	public String toString(){
			
			return music+" is playing ";
		}
}
class Laptop{
	private MobileBluetooth mobileBluetooth;
	private String music;
	Laptop(String music, MobileBluetooth mobileBluetooth){
		this.mobileBluetooth = mobileBluetooth;
		this.music=music;
	}
	public String toString(){
			
			return music+" is playing ";
		}
}

