package com.ge.exceptiondemo.mycollection;

public class Stack {
	private int top=-1;
	int[] arr=new int[5];
	
	public  void push(int x) throws StackFullException{
		if(top>=4) {
			 throw new StackFullException("Stack is full cannot add elements");
		}
		else {
			top++;
			arr[top]=x;
			
		}
	}
	
	public int pop() throws StackEmptyException{
		int num=0;
		if(top==-1) {
			throw new StackEmptyException("Stack is empty");
		}
		else {
			 num=arr[top--];
			
		}
		return num;
			
	}
	
	public void display() throws StackEmptyException{
		if(top==-1) {
			throw new StackEmptyException("Stack is empty");
		}
		else {
			for(int i=0;i<=top;i++)
				System.out.print(arr[i]+" ");
		}
	}
	
	
}
