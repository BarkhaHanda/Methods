package Assignment3;

public class ClassB2 extends ClassA2{
	
	public void Methodnew4() {			//Discrete Method of Class B2
		System.out.println("First Discrete Method of Class B2");
	}
	
	public void Methodnew5() {			//Discrete Method of Class B2
		System.out.println("Second Discrete Method of Class B2");
	}		
	
	public ClassB2() // Constructor of parent classB1
	{
		System.out.println("Default Constructor of Child ClassB2");
	}
	
		
	public ClassB2(int aa3,int bb2) 	//Constructor of Class B2 with different parameter
	{
		
		System.out.println("Parameter of First Constructor Methodpar1 class B2" +aa3);
		System.out.println("Parameter of First Constructor Methodpar1 class B2" +bb2);
	}
	
	public ClassB2(int aa4 ) 	//Constructor of Class B2 with different parameter
	{
		
		System.out.println("Parameter of Second Constructor Methodpar1 class B2" +aa4);
			}
}
