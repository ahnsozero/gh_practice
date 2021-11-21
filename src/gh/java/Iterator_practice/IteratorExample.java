package gh.java.Iterator_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Integer("1"));
		list.add(new Integer("2"));
		list.add(new Integer("3"));
		list.add(new Integer("4"));
		list.add(new Integer("5"));
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
