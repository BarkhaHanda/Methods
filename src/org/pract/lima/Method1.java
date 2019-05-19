package org.pract.lima;

public class Method1 {
	
	public static void main(String arg[]) {
		int i=1;
		Method1 m1= new Method1();
		//m1.fact();
		//m1.multiply();
		//m1.sumoften();
		m1.onetoten();
		//m1.test();
		System.out.println();
		int a=3,b=6;
		m1.fact(a, b);
	}
	
public int fact(int n,int m) {
	int i = 1;
	int fact = 1;
	while(i<=4) {
		fact*=i;
		i++;
	}
	System.out.println(fact);
	return fact;
}
public int multiply() {
	int i=1;
	int mul=2;
	int c = 0;
	while(i<=10) {
		System.out.println(c=mul*i);
		i++;
}
	return c;
}

public int sumoften() {
	int i = 1;
	int sum = 0;
	while(i<=10) {
		sum +=i;
		i++;
	}
	System.out.println(sum);
	return sum;
} 
	
public void onetoten() {
	int x=1;
	while(x<=10)
	{
		System.out.println(x);
		x++;
	}
		return ;
	}
public void test() {
	int i=0;
	
	while(i<5)
	{
		System.out.println(i);
		i++;
	}
}
}