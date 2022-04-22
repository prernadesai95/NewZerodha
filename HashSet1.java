package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	
		System.out.println(hs.isEmpty()); //TRUE
		System.out.println(hs.size());    //0
		hs.add("January");
		hs.add("February");
		hs.add("March");
		hs.add("April");
		hs.add("May");
		hs.add("June");
		hs.add("July");
		hs.add("August");
		hs.add("September");
		hs.add("Octomber");
		hs.add("August");
		hs.add("November");
		hs.add("December");
		hs.add(null);
		
		System.out.println(hs.isEmpty()); //FALSE
		System.out.println(hs.size()); //14
		System.out.println(hs);
		
		System.out.println(hs.contains("August")); //True
		hs.remove("May");
		hs.add("Sunday");
		System.out.println(hs);
		
	Iterator itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}

	