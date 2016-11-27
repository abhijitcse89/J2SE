package com.abhijit.j2se.rmi;

import java.rmi.Naming;

public class Server {

	public static void main(String[] args) throws Exception {
		Addition addObject = new Addition();
		Naming.rebind("ADD", addObject);
		System.out.println("Server started");
	}
}
