package Exception;

import java.sql.SQLClientInfoException;

public class THROWSS {

	static void Age (int age)throws ArithmeticException, SQLClientInfoException,ArrayIndexOutOfBoundsException
	{
		if(age<18)
		{
			throw new ArithmeticException (" Stop the execution");
		}
		else
		{
			System.out.println("You are welcome");
		}
	}
	public static void main(String[] args) {
		try {
		Age(17);
		}catch(Exception e)
		{	
			System.out.println(e);
			
		}
		System.out.println("Satish Nakhate");
	}

}
