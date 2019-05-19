package Assignment3;

public class ClassA2 {

	public ClassA2() // Constructor of parent classA1
	{
		System.out.println("Default Constructor of parent classA2");
	}
	
	public void Methodnew2() {			//Discrete Method of Class A1
		System.out.println("First Discrete Method of Class A2");
	}
	
	public void Methodnew3() {			//Discrete Method of Class A1
		System.out.println("Second Discrete Method of Class A2");
	}
	
	public ClassA2(int aa1,int bb1) 	//Constructor of Class A2 with different parameter
	{
		
		System.out.println("Parameter of First Constructor Methodpar1 class A2" +aa1);
		System.out.println("Parameter of First Constructor Methodpar1 class A2" +bb1);
	}
	
	public ClassA2(int aa2) 	//Constructor of Class A2 with different parameter
	{
		
		System.out.println("Parameter of Second Constructor Methodpar1 class A2" +aa2);
			}
}
