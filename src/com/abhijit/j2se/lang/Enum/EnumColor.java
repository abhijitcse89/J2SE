package com.abhijit.j2se.lang.Enum;
enum Color{
//	public static final Color RED = new Color();
	
	RED{ // anonymous inner class
		public void info(){
			System.out.println("Emergency Color");
		}
	},GREEN,BLUE;
	
	public void info(){
		System.out.println("Universal Color");
	}
}
public class EnumColor {

	public static void main(String[] args) {
		Color[] clr  = Color.values();
		for(Color c1:clr){
			System.out.print(c1+"...");
			c1.info();
		}
	}
}



