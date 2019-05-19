package org.pract.lima;

public class Method {

	public static void main(String args[]) {
		
	Method m=new Method();
	Method.display();
	
	System.out.println(m.sum(10,10,0));
	
	}
	
	public int sum(int a,int b,int c) {
		
		c= a+b;
		return c;
	}
	
	public static void display() {
		
		System.out.println("Hello");
	}
}
