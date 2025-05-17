package Exception;

public class arrEx {

	public static void main(String[] args) {
		
		int a[] = new int [5];
		
		// No execution of rest of code
		
		
		//Used try to throw the Exception 
		try
		{
			a[5]= 30/0;
			System.out.println(a[11]);
			
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Thrown an Arithematic Exception");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out of bond Exception ");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
