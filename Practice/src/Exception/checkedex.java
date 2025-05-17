package Exception;

import java.io.EOFException;

public class checkedex {
	
	public static void main(String[] args)
	{
		//Checke Exception occure during compile time 
		
		//Arthimatic Exception like if value can not divided by 0
		//It will throw error
		//int a = 10;
		try 
		{
		String m= null;
		//int b =10/0;
		System.out.println(m.length());
		}
		catch (Exception c)
		{
			System.out.println(c);
		}
		System.out.println("Rest code should be execute");
	
		
			
		
	}

}
