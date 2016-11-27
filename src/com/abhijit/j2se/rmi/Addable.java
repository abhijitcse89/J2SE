package com.abhijit.j2se.rmi;

import java.rmi.Remote;

interface Addable extends Remote{
	public int add(int x,int y) throws Exception;
}
