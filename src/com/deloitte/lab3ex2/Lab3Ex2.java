package com.deloitte.lab3ex2;

public class Lab3Ex2 {
	public static String getImage(String str) {
		StringBuffer sb = new StringBuffer(str).reverse();
		return (str + "|" + sb);
		
	}
	
	public static void main(String[] args) {
		String str = " Hello World"; 
		
		System.out.println(getImage(str));
	}
}
