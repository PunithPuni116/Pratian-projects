package assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BankApp {
	
	
	private ArrayList<Account>account=new ArrayList<>();
	
	public void setAccountList(ArrayList<Account> a) {
		this.account=a;
	}
	
	public int checkEquality(ArrayList<Account> a) {
		int count=0;
		HashSet<Double>set=new HashSet<>();
		for(int i=0;i<a.size();i++) {
			Account aci=a.get(i);
			int temp=0;
			for(int j=i+1;j<a.size();j++) {
				Account acj=a.get(j);
				if(aci.equals(acj) && !set.contains(acj.getBalance())) {
					temp++;
			
				}
					
			}
			set.add(aci.getBalance());
			count+=(temp>0)?temp+1:temp;
		}
		return count;
//		
		
	}

}
