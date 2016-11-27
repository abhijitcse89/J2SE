package com.abhijit.j2se.lang.Enum;
enum Beer{
	MILLER(180),CURLSBURG(130),KINGFISHER(70),FROSTER;
	
	int price;
	Beer(int price){
		this.price=price;
	}
	Beer(){
		this.price=65;
	}
	public int getPrice(){
		return price;
	}
}
public class Enum {
	public static void main(String[] args) {
		Beer[] beer = Beer.values();
		for(Beer br : beer){
			System.out.println(br+"..."+br.getPrice());
		}
	}
}
