
public class reversestring {
	
	public static void main(String[] args)
	{
		String data= "Capgemini";
		String rev= "";
		String newdata="India";
		
		System.out.println("Lenght  :  "   + data.length());
		for (int i =data.length()-1; i>=0; i--)
		{
			rev= rev+data.charAt(i);
			
		}
		System.out.println(data);
		System.out.println(rev);
		System.out.println(data.charAt(2));
		rev= data.concat(newdata);
		System.out.println(rev);
		
		
		
		
	}
}
	
	
	


