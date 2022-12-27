package assignmentTreeSet;

import java.util.Comparator;

public class SortBalance implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		
		 if(o1.getBalance()>o2.getBalance())
			return 1;
		
		return -1;
	}

}
