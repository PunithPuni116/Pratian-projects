package assignmentTreeSet;

import java.util.Comparator;

public class SortName implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		
	}

}
