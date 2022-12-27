package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LinkedListDemo {
	
	private ArrayList<Integer>list1=new ArrayList<>();
	private ArrayList<Integer>list2=new ArrayList<>();
	private ArrayList<Integer>result=new ArrayList<>();
	public ArrayList<Integer> getList1() {
		
		return list1;
	}
	public void setList1(ArrayList<Integer> list1) {
		this.list1 = list1;
	}
	public ArrayList<Integer> getList2() {
		return list2;
	}
	public void setList2(ArrayList<Integer> list2) {
		this.list2 = list2;
	}
	
	public boolean checkEquality() {
		if(list1.size()!=list2.size())
			return false;
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)!=list2.get(i))
				return false;
		}
		return true;
			
	}
	
	public void mergeList() {
		HashSet<Integer>set=new HashSet<>();
		int i=0;
		int j=0;
		while(i<list1.size()) {
			if(!set.contains(list1.get(i))){
				result.add(list1.get(i));
			}
			set.add(list1.get(i));
			i++;
			
		}
		while(j<list2.size()) {
			if(!set.contains(list2.get(j))){
				result.add(list2.get(j));
			}
			set.add(list2.get(j));
			j++;
			
		}
		
		
	}
	public void display(boolean flag) {
		if(!flag) {
				Iterator i=result.iterator();
				while(i.hasNext()) {
				System.out.print(i.next()+" ");
				}
			}
		else {
			Iterator i=list1.iterator();
			while(i.hasNext())
				System.out.print(i.next()+" ");
		}
	}
	
}
