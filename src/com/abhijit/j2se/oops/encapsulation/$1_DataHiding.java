package com.abhijit.j2se.oops.encapsulation;

public class $1_DataHiding {
	/**
	 * It is meant for security
	 */
	private String userName;
	private String userPass;
	private double balance;
	$1_DataHiding(String userName, String userPass){
		this.userName=userName;
		this.userPass=userPass;
	}
	
	public double method(String userName,String userPass){
		if(this.userName.equalsIgnoreCase(userName) && this.userPass.equalsIgnoreCase(userPass)){
			System.out.println("You are authorised person!!!");
			balance =1_00_000.00;
			return balance;
		}
		else
		{
			System.out.println("Yo are not authorised person!!!");
			return 0.00;
		}
	}
	

}
class MainDataHiding{
	public static void main(String[] args) {
		$1_DataHiding dh1 = new $1_DataHiding("admin","admin");
		double balance = dh1.method("admin", "admin1");
		System.out.println(balance);
	}
}