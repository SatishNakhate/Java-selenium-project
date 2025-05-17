package ccollection;

import java.util.*;

public class arraylisted {
//Arraylist also used to store the duplocate data 
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Satish");
		//list.add(25, "Mahesh");
		list.add("Kunal");
		list.add("Atul");
		list.add("Kunal");
		list.add("Atul");
		list.add("Kunal");
		list.add("Atul");
		list.add("Kunal");
		list.add("Atul");
		list.add("Kunal");
		list.add("Atul");
		
		Iterator itrr= list.iterator();
		//System.out.println(list);
		while (itrr.hasNext())
		{
			System.out.println(itrr.next());
		}
	}

}
