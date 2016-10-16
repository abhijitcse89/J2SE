package com.abhijit.j2se.oops.inheritance;

public class $3_IsARelationship {
/**
 * This is meant for Code re-usability
 * 
 * Is-A Relationship : If we want every functionality from the parent to child , we should go for Is-A relationship.
 *
 * P p = new P(); // allow all parent specific functionality
 * C c = new C(); // allow all Child + parent specific functionality
 * P p = new C(); // allow only parent specific functionality, otherwise we will get a Compile time error
 */
	public static void main(String[] args) {
		Person person = new Person();
		person.think(); //Person can think using brain
		person.eat();   //Person eats Food...
		person.walk();  //Person can walk using two legs 
		
		Engineer eng = new Engineer();
		eng.think();// Engineer can think more than others...
		eng.eat();  //Person eats Food...
		eng.walk(); //Person can walk using two legs
		
		Person person2 = new Engineer();
		person2.think(); // Engineer can think more than others...
		person2.eat();   //Person eats Food...
		person2.walk();  //Person can walk using two legs
	}
	
}

class Person{
	public void eat(){
		System.out.println("Person eats Food...");
	}
	public void walk(){
		System.out.println("Person can walk using two legs");
	}
	public void think(){
		System.out.println("Person can think using brain");
	}
}
class Engineer extends Person{
	
	public void think(){
		System.out.println("Engineer can think more than others...");
	}
	
}