package com.abhijit.j2se.misc;

public class ReverseNumber {
	public static void main(String[] args) {
		int input = 534;
		System.out.println("Input Number: "+input);
		int reverse=0;
		int reminder=0;
		System.out.print("Reverse Number: ");
		while(input!=0){
			reminder =input%10; // 4
			reverse=reverse/10+reminder; //4
			input=input/10; //53
			System.out.print(reminder);
		}
		
	}
}
