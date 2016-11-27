package com.abhijit.j2se.rmi;

import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements Addable {
	
	public Addition() throws Exception{
		super();
	}
	
	@Override
	public int add(int x, int y) throws Exception {
		return x+y;
	}

	
}
