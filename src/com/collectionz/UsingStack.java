package com.collectionz;

import java.util.Stack;

public class UsingStack {
	public static char[] a1={'{','(','['};
	public static char[] a2={'}',')',']'};
	
	public static void main(String[] args){
		Stack<Character> s=new Stack<>();
		String str1 = "{[]{}}}}}}}}";
		char[] str=str1.toCharArray();
		
		
		for (int i = 0; i < str.length; i++) {
			if (s.isEmpty()) {
				s.push(str[i]);
			}
			else{
				if(s.peek()!= UsingStack.getBrace(str[i]))
						s.push(str[i]);
				else
					s.pop();
			}
		}
		
		if (!s.isEmpty()) {
			System.out.println(s);
			System.out.println("Not palindrome");
		}
		else {
			System.out.println("Is palindrome :)");
		}
	}
	public static char getBrace(char c){
		for (int i = 0; i < a1.length; i++) {
			if (a1[i]==c){
				return a2[i];				
			}
			if(a2[i]==c) {
				return a1[i];				
			}
		}
		return c;
		
	}
}
