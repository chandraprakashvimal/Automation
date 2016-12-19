package com.collectionz;

public class Stack {
	public int max;
	public int[] array;
	public int top;
	
	public Stack(int size){
		max=size;
		array = new int[size];
		top=-1;
	}
	
	public void push(int item){
		array[++top]=item;
	}	
	public int pop(){
		return array[top--];
	}
	public int peek(){
		return array[top];
	}
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isFull(){
		return(top==max-1);				
	}
	public static void main(String[] args){
		Stack s=new Stack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);		
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		while(!s.isEmpty())
			System.out.print(s.pop()+ " ");
		
	}

}
