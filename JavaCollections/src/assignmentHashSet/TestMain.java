package assignmentHashSet;

import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) {
		HashSet<String>set1=new HashSet<>();
		set1.add("micromax");
		set1.add("nokia");
		set1.add("lG");
		set1.add("apple");
		set1.add("samsung");
		HashSet<String>set2=new HashSet<>();
		set2.add("sony");
		set2.add("htc");
		set2.add("apple");
		set2.add("spice");
		set2.add("nokia");
		
		HashSetDemo hs=new HashSetDemo();
		hs.intersection(set1, set2);
		
		hs.union(set1, set2);
		hs.differenceInSet1(set1, set2);
		hs.differenceInSet2(set1, set2);
		
	}
}
