package com.abhijit.j2se.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapUserDefinedObject {

	public static void main(String[] args) {
		Map<Integer,Employee> hm = new HashMap(10,0.90F);
		
		Employee emp1 = new Employee(100,"Abhijit0");
		Employee emp2 = new Employee(101,"Abhijit1");
		Employee emp3 = new Employee(102,"Abhijit2");
		Employee emp4 = new Employee(103,"Abhijit3");
		
		hm.put(emp1.getId(), emp1);
		hm.put(emp2.getId(), emp2);
		hm.put(emp3.getId(), emp3);
		hm.put(emp4.getId(), emp4);
		
//		System.out.println(hm);
		
//		Iterator<Integer> itr = hm.keySet().iterator();
//		while(itr.hasNext()){
//			System.out.println(hm.get(itr.next()));
//		}
		
		Set<Map.Entry<Integer,Employee>> entry = hm.entrySet();
		for(Map.Entry<Integer, Employee> en : entry){
//			System.out.println(en);
			System.out.print(en.getKey());
			System.out.println("="+en.getValue());
			
		}
		
	}
}

//Epmloyee class
class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
}

