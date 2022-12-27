package asssignment3;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
	public static void main(String[] args) {
		Student student1 = new Student (1001, "Geetha", 80);
		Student student2 = new Student (1002, "Deepa", 70);
		Student student3 = new Student (1003, "Shwetha", 75);
		Student student4 = new Student (1004,"Lakshmi", 60);
		Student student5 = new Student (1005,"Roopa", 65);
		Student student6 =new Student (1006, "Mamatha", 77);
		ArrayList<Student>list=new ArrayList<>();
		list.add(student1);
		list.add(student3);
		list.add(student2);
		list.add(student5);
		list.add(student4);
		list.add(student6);
		
		Collections.sort(list);
		for(Student s: list) {
			System.out.println("student Id : "+ s.getStudentId());
			System.out.println("student Name: "+s.getStudentName());
			System.out.println("student score: "+s.getStudentScore()+"\n");
			
		}
		

		
	}
}
