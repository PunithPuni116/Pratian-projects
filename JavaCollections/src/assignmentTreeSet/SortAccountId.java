package assignmentTreeSet;

import java.util.Comparator;

public class SortAccountId implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		if(o1.getAccountId()==o2.getAccountId())
			return 0;
		else if(o1.getAccountId()>o2.getAccountId())
			return 1;
		
		return -1;
	}

}
