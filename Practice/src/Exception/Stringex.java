package Exception;

public class Stringex {

	public static void main(String[] args) {
		try 
		{
		String s = null;
		String d = "Satish";
		
		System.out.println(s.length());
		System.out.println(d.concat(s));
		}
		catch (ArithmeticException d)
		{
			System.out.println("Print Arithmetic Exception");
		}
		catch (ArrayIndexOutOfBoundsException d)
		{
			System.out.println("Print Array Exception");
		}
		catch (Exception d)
		{
			System.out.println("Null point Exception");
		}
		System.out.println("Print rest of code");
	}

}
