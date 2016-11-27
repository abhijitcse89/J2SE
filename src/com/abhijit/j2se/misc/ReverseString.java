package com.abhijit.j2se.misc;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int length = input.length();
		System.out.println(length);
		
		for(int i =length-1;i>=0;i--){
			System.out.print(input.charAt(i));
		}
	}
}
