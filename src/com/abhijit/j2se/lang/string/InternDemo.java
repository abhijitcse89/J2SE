package com.abhijit.j2se.lang.string;

public class InternDemo {

	public static void main(String[] args) {
		String s1= new String("Abhijit"); // Heap Area --> "Abhijit" and SCP Area --> "Abhijit"
		String s2=s1.concat("Roy");       // Heap Area --> "AbhijitRoy" and SCP Area --> "Roy"
		String s3=s2.intern();            // Heap Area --> s3 will point to scp area with a newly created obejct "AbhijitRoy"
		String s4="AbhijitRoy";
		System.out.println(s2==s3); //false
		System.out.println(s3==s4); //true
	}
}
