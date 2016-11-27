package com.abhijit.j2se.oops.gc;

public class GC_Runtime {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total : "+((runtime.totalMemory())/(1024*1024))+" MB");
		System.out.println("free :  "+((runtime.freeMemory())/(1024*1024))+" MB");
		for(long i=0; i<1000000000;i++){
			GC_Runtime gc =  new GC_Runtime();
			gc=null;
		}
		System.out.println("After creating object, free Memory : "+((runtime.freeMemory())/(1024*1024))+" MB");
		System.out.println("After creating object, used Memory : "+((runtime.totalMemory()-runtime.freeMemory()))/(1024*1024)+" MB");
		runtime.gc();
		System.out.println("After calling GC, free Memory : "+((runtime.freeMemory())/(1024*1024))+" MB");
		System.out.println("After calling GC, used Memory : "+((runtime.totalMemory()-runtime.freeMemory()))/(1024*1024)+" MB");
	}
}
