package com.abhijit.j2se.misc;


public class ReverseSentence {
	 public static void main(String[] args) {
		 String input ="My name is Abhijit";
		 System.out.println(input);
		 String[] words = input.split(" ");
		 for(int i=words.length-1;i>=0;i--){
			 System.out.print(words[i]+" ");
		 }
	 }
}
