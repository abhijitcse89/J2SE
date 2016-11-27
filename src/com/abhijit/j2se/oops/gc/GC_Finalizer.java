package com.abhijit.j2se.oops.gc;

public class GC_Finalizer {

//	public static void main(String[] args) {
////		String obj = new String("Abhijit");
//		GC_Finalizer obj = new GC_Finalizer();
//		
//		obj.finalize();
//		obj.finalize();
//		obj=null;
//		Runtime.getRuntime().gc();
//		
//		System.out.println("Main Thread called...");
//		
//		
//	}
//	@Override
//	public void finalize(){
//		System.out.println("Finalizer method called...");
//	}
//	public static GC_Finalizer gf;
//	
//	public static void main(String[] args) throws InterruptedException{
//		
//		GC_Finalizer gc = new GC_Finalizer();
//		System.out.println(gc.hashCode());
//		gc =null;
//		System.gc();
//		Thread.sleep(3000);
//		System.out.println(gf.hashCode());
//		gf=null;
//		System.gc();
//		Thread.sleep(5000);
////		System.out.println(gf.hashCode());
//		System.out.println("End of Main");
//		
//	}
//	@Override
//	public void finalize(){
//		System.out.println("Finalized method called...");
//		gf=this;
//	}
	
	// Check whether JVM calls GC automatically
	static long count = 0;
	public static void main(String[] args) {
		for(int i=0;i<10000000;i++){
			/*GC_Finalizer gc =*/ new GC_Finalizer();
//			gc=null;
		}
//		System.gc();
		
	}
	protected void finalize(){
		System.out.println("finalize got called : "+ ++count);
	}
}
