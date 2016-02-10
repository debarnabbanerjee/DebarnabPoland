package com.debarnab.testcases;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		String a = "A";
		String b = "A";
		String c = "A";
		String d = "A";
		
		List<String> str= new ArrayList<String>();
		str.add(a)		;
		str.add(b)		;
		str.add(c)		;
		str.add(d)		;		 
		
		System.out.println("The size of the list is " + str.size());

	}

}
