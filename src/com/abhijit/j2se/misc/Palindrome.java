package com.abhijit.j2se.misc;

public class Palindrome {
	
	public static void main(String[] args) {
		String pal = "madam",rev="";
		int len = pal.length();
		int div = len/2;
		for(int i=0;i<=div;i++){
			rev=rev+pal.charAt(i);
		}
	}
	
}



// this is the basic time complexity O(n)

/*public static void main(String[] args) {
	String pal = "mad1123am",rev="";
	int len = pal.length();
	
	for(int i=len-1;i>=0;i--){
//		System.out.print(pal.charAt(i));
		rev=rev+pal.charAt(i);
		
	}
	System.out.println(rev);
	if(rev.equals(pal)){
		System.out.println("It is a palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
}*/