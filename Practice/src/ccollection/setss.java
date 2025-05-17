package ccollection;

import java.util.HashSet;
import java.util.Iterator;

public class setss {

	public static void main(String[] args) {
		// Sets alwys used to avoid the duplication 
		//Hashset,LinkedHashSet, TreeSet
		//HashSet
		
		HashSet hs = new HashSet ();
		hs.add("Satish Nakhate");
		hs.add(500);
		hs.add("Kunal");
		hs.add("Monika");
		hs.add(500);
		hs.add("Kunal");
		hs.add("Monika");
		hs.add(500);
		hs.add("Kunal");
		hs.add("Monika");
		
		Iterator im = hs.iterator();
		
		while(im.hasNext())
		{
			System.out.println(im.next());
		}
		
	}

}
