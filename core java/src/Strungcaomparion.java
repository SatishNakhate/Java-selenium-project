
public class Strungcaomparion 
{
	
	public static void main (String [] args)
	{
		String s1 = new String("Satish");
		String s2 = new String("Satis");
		System.out.println(s1==s2);
		System.out.println(".Equal    :"   + s1.equals(s2));
		
		String s3= "Nakhate";
		String s4= "Nakhate";
		System.out.println(s3==s4);
		System.out.println(".Equal    :"   + s3.equals(s4));
		
		
		
		//Cocate
		System.out.println(s1.concat(s4));
		
		//Comparision
		String s5= "Mango";
		String s6="Apple";
		System.out.println(s5.equalsIgnoreCase(s6));
		int ing= "Apple".compareToIgnoreCase("mango");
		System.out.println(ing);
		
		//String is Immutable
		String p1= "Pune";
		String p2= "Pune";
		String p3= "Pune";
		String p4= "Pune";
		String p5= "Pune";
		String p6= "Pune";
		String p7= "Pune";
		String p8= "Pune";
		String p9= "Pune";
		String p10= "Mumbai";
		String p11= "Pune";
		String p12= "Pune";
		String p1000= "Pune";
		
		
		
		System.out.print(p1	+"" + p2+"" +	p3+"" +	p4+"" +	p5+"" +	p6+"" +	p7+"" +	p8+"" +	p9+"" +	p10 +"" +	p11	+"" +p12);
		
		
		
		//Differance Bet Final and the Immutable
		
		//If i create String Buffer then
		
		final StringBuffer sb= new StringBuffer("Satish");
		//Here i made the referance final not an object
		//sb=sb.append("Java");--> Here i could not able to reassign it because of the final modifier
		sb.append("Java"); //But i can change the value vithout reassigning 
		System.out.println("Final data         :" + "   " + sb);
		
		
		
		
	}
}
