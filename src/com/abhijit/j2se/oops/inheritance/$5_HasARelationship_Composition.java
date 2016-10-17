package com.abhijit.j2se.oops.inheritance;

public class $5_HasARelationship_Composition {
/**
 * Strong Association
 * 
 */
	public static void main(String[] args) {
		OracleIndia ora =  new OracleIndia();
		ora.triage();
		ora.fix();
		ora.facility();	
	}
}

class OracleIndia{
	public void triage(){
		System.out.println("Triaging the incident");
	}
	public void fix(){
		System.out.println("Fixing the issue");
	}
	public void facility(){
		System.out.println("Oracle doesn't good in facility as compare to others");
	}
}
class Java{
//	public static void main(String[] args) {
//		OracleIndia ora =  new OracleIndia();
//		ora.triage();
//		ora.fix();
//		ora.facility();
//		
//	} 
}