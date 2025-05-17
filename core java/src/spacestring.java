
public class spacestring {

	public static void main(String[] args) {
		String s= "SatishNakhate";
		String s1= "  Nakhate satish";

		System.out.println(s.charAt(5));
		System.out.println(s.concat(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String sv= s1.trim();
		System.out.println(s1);
		System.out.println(sv);
		
		
		String svc="Hellow World";
		String removespace= svc.replace(" ", "");
		System.out.println(svc);
		System.out.println(removespace);
		String adds= removespace.replace("", " ");
		System.out.println(adds);
	}

}
