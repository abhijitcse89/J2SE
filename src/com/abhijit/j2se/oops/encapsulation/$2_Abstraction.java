package com.abhijit.j2se.oops.encapsulation;

public class $2_Abstraction {

	/**
	 * It is also meant for Security
	 * if we don't want to show the internal implementation, 
	 * only want to show the set of services which we are offering is a concept of Abstraction
	 */
	
	private  double balance=10_000;
	public  double deposite(double depositeAmount){
		balance = balance+depositeAmount;
		return depositeAmount;
	}
	public double withdrawl(double withdrawlAmount){
		balance = balance - withdrawlAmount;
		return withdrawlAmount;
	}
	
	public double showBalance(){
		return balance;
	}
}

class MainAbstraction{
	public static void main(String[] args) {
		$2_Abstraction abs = new $2_Abstraction();
		double showBalance = abs.showBalance();
		System.out.println("initial Balanace : "+showBalance);
		abs.deposite(10_000);
		System.out.println("After Deposite, Balance : "+abs.showBalance());
		abs.withdrawl(5_000);
		System.out.println("After Withdrawl, Balance : "+abs.showBalance());
	}
}