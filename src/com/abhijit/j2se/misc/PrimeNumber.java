package com.abhijit.j2se.misc;

public class PrimeNumber {
//	public static void main(String[] args) {
//		int start=2,end=100;
//		
//		for(int i=start;i<=end;i++){ // it will iterate 2-100 times for prime number
//			for(int j=2;j<=i;j++){
//				if(j==i){
//					System.out.print(i+",");
//				}
//				if(i%j==0){
//					break;
//				}
//			}
//			
//		}
//		
//	}
//////////////////////////////////////////////////////////////////////////////////////////////////////	
//	public static void main(String[] args) {
//		boolean isPrime=false;
//		int start=2,end =100;
//		for(int i=start;i<=end;i++){
//			for(int j=1;j<=i;j++){
//				if(i%j!=0){
//					isPrime=true;
//				}
//			}
//			if(isPrime){
//				System.out.print(i+",");
//				isPrime=false;
//			}
//		}
//		
//	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////	
//	
	public static void main(String[] args) {
		int roundCount=0;
	for(int i=2; i<100;i++){	
		for(int j=1;j<=i;j++){
			
			double result=(double) i/j;
//			System.out.println(result+" : "+Math.ceil(result));
			if(result==Math.ceil(result)){
				roundCount++;
			}
			
		}
		if(roundCount==2){
			System.out.print(i+",");
		}
		roundCount=0;
	  }
	}
}
