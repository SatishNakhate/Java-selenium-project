package ccollection;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetss {

	public static void main(String[] args) {
		// used for acceding order and avoid duplication 
		TreeSet ts = new TreeSet();
		ts.add("Satish");
		ts.add("Mahesh");
		ts.add("Kunal");
		ts.add("Atul");
		ts.add("Prem");
		ts.add("Kunal");
		ts.add("Atul");
		ts.add("Prem");
		
		Iterator<String> lts=ts.iterator();  
		//Iterator lts = ts.iterator();
		while(((Iterator<String>) ts).hasNext())
		{
			//System.out.println(ts.next);
		}
	}

}
