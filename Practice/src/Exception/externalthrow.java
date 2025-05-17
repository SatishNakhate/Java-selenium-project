package Exception;

public class externalthrow {

	public static void main(String[] args) {
		int age = 17;
		if (age <18)
		{
			throw new ArithmeticException("Not Eligible for vote ");
		}
		else
		{
			System.out.println("You are welcome for the vote");
		}
		
		System.out.println("Run the rest of thr code");
		

	}

}
