package org.pract.lima;

public class Palindrome {

	public static void main(String args[]){
		int n=121;
		int temp=n;   //to store the original value
		int pal=0,r=0;   //to store reverse number
		while(n>0)
		{
			r=n%10;
			pal=pal*10+r;
			n=n/10;
		}
		
	}
	
	
	
}

