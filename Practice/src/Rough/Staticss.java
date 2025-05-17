package Rough;

public class Staticss {
	
	//Static Methode 
	static void c()
	{
		System.out.println("Nakhate Satish G");
	}
	//Non Static methode
	void m ()
	{
		System.out.println("Satish Nakhate");
	}

	public static void main(String[] args) {
		
		
	c(); //Its Belonging with class only 
	//m();- Non Static method its not Belonging with class
	//For Non static method we have to create the object of class
	
	Staticss j = new Staticss();
	j.m();
	}

}
