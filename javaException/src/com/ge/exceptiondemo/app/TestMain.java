package com.ge.exceptiondemo.app;
import com.ge.exceptiondemo.mycollection.*;
public class TestMain{
	public static void main(String[] args) throws StackFullException, StackEmptyException{
		
		
		Stack s=new Stack();
		try {
			//s.pop();
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			s.pop();
			s.push(6);
			//s.push(7);
			
			s.display();
			s.pop();
		}
		catch(StackFullException e) {
			e.getMessage();
		}
		catch(StackEmptyException e) {
			e.getMessage();
		}
		
		
	}
}
