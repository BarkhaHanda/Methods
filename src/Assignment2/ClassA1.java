package Assignment2;

public class ClassA1 {

	public ClassA1() // Constructor of parent classA1
	{
		System.out.println("Constructor of parent classA1");
	}
	
	public void Methodnew1() {			//Discrete Method of Class A1
		System.out.println("Discrete Method of Class A1");
	}
	
	public void Methodpar(int a1,int b1) 	//Method of Class A1 with Same name and different parameter
	{
		
		System.out.println("Parameter of class A1" +a1);
		System.out.println("Parameter of class A1" +b1);
	}
}
