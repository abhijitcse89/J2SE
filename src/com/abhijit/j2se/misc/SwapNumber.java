package com.abhijit.j2se.misc;

public class SwapNumber {

	public static void main(String[] args) {
		int a=5; // 5=>101
		int b=4; // 4=>100
		
		System.out.println("value a:"+a+", value b:"+b);
//		a=a+b; //tot 10+20=30
//		b=a-b; // tot-b=a // b got value of a   // 30-20=10
//		a=a-b; // tot-b= 30-10=20
		
//		0^0 = 0, 0^1 = 1, 1^0 = 1, 1^1 = 0
		
		a=a^b; // 101 XOR 100 => 001
		b=a^b; // 001 XOR 100 => 101 = 5
		a=a^b; // 001 XOR 101 => 100 = 4
		
		System.out.println("value a:"+a+", value b:"+b);
	}
}
