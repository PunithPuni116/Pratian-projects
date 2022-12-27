package assignment2;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			list1.add(i);
			list2.add(i);
		}
		list2.add(2);
		list2.add(3);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(8);
		LinkedListDemo listDemo=new LinkedListDemo();
		listDemo.setList1(list1);
		listDemo.setList2(list2);
		boolean flag=listDemo.checkEquality();
		if(flag) {
			listDemo.display(flag);
			}
		else {
			listDemo.mergeList();
			listDemo.display(flag);
		}
	
	}
}
