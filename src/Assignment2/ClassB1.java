package Assignment2;

public class ClassB1 extends ClassA1 {

	public void Methodnew2() 		//Discrete Method of Class B1
	{
		System.out.println("Discrete Method of Class B1");
			}

	public ClassB1() // Constructor of parent classB1
	{
		System.out.println("Constructor of Child classB1");
	}
	
	public void Methodpar(int a2,int b2) 	//Method of Class B1 with Same name and different parameter
	{
				
		System.out.println("Parameter of class B1" +a2);
		System.out.println("Parameter of class B1" +b2);
	}
}
