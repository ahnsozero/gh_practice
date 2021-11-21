package sec03.exam01__hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBaTis");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBaTis");
		
		System.out.println(set.size());
		
		
		for(String s : set) {
			System.out.println(s);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
