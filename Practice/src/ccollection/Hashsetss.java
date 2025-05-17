package ccollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashsetss {

	public static void main(String[] args) {
		// LinkedHash Set Basically used for the avoid the duplication
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Satish");
		lhs.add("Mahesh");
		lhs.add("Kunal");
		lhs.add("Atul");
		lhs.add("Prem");
		lhs.add("Kunal");
		lhs.add("Atul");
		lhs.add("Prem");
		
		Iterator itm = lhs.iterator();
		while(itm.hasNext())
		{
			System.out.println(itm.next());
		}
	}

}
