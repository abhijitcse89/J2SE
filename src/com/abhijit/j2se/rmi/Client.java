package com.abhijit.j2se.rmi;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) throws Exception{
		Addable addable =(Addable) Naming.lookup("ADD");
		
		int result  = addable.add(3,4);
		System.out.println("Addition is : "+result);
	}
}
