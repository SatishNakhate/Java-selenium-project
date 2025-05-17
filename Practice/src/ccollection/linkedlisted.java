package ccollection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlisted {
//LinkedList Alwys saved the duplicate data
	public static void main(String[] args) {
		LinkedList ld = new LinkedList();
		ld.add("Satish");
		ld.add("Mahesh");
		ld.add("Kunal");
		ld.add("Atul");
		ld.add("Prem");
		ld.add("Kunal");
		ld.add("Atul");
		ld.add("Prem");
		
		Iterator its = ld.iterator();
		while (its.hasNext())
		{
			System.out.println(its.next());
		}
		
	}

}
