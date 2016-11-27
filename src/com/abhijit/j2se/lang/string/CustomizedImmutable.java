package com.abhijit.j2se.lang.string;


final class Immutable{
	int imm;
	Immutable(int imm){
		this.imm=imm;
	}
	public Immutable update(int imm){
		if(this.imm==imm){
			return this;
		}
		else
			return new Immutable(imm);
	}
//	public void equals(int i){
//		this.imm=i;
//	}
	public String toString(){
		return imm+"";
	}
}


public class CustomizedImmutable {
	public static void main(String[] args) {
		Immutable im1 = new Immutable(10);
		Immutable im2 = im1.update(10);
		Immutable im3 = im1.update(100);
		System.out.println(im1==im2); // true
		System.out.println(im1==im3); // false
		
		String st1 = new String("Ab");
		String st2 = st1.concat("Ab");
		String st3 = st1.concat("Abhi");
		System.out.println(st1==st2); // true
		System.out.println(st1==st3); // false
		
		
		Immutable imm = new Immutable(100);
		imm.update(200);
		System.out.println(imm);
	}
	
}
