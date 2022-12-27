package assignmentHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	
	public void union(HashSet<String>set1,HashSet<String>set2) {
		System.out.print("union of sets : ");
		HashSet<String>set3=new HashSet<>();
		set3.addAll(set1);
		set3.addAll(set2);
		Iterator i=set3.iterator();
		System.out.print(set3);
		System.out.println();
	}
	
	public void intersection(HashSet<String>set1,HashSet<String>set2) {
		System.out.print("intersection of sets: ");
		Iterator i=set1.iterator();
		while(i.hasNext()) {
			String s=(String) i.next();
			if(set2.contains(s)) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
	}
	public void differenceInSet1(HashSet<String>set1,HashSet<String>set2) {
		System.out.print("Difference in set 1 : ");
		Iterator i=set1.iterator();
		while(i.hasNext()) {
			String s=(String) i.next();
			if(!set2.contains(s))
				System.out.print(s+" ");
		}
		System.out.println();
	}
	public void differenceInSet2(HashSet<String>set1,HashSet<String>set2) {
		System.out.print("Difference in set 2 : ");
		Iterator i=set2.iterator();
		while(i.hasNext()) {
			String s=(String) i.next();
			if(!set1.contains(s))
				System.out.print(s+" ");
		}
		System.out.println();
	}
	
}
