package com.debarnab.testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Testing {
	@Test
	public  void testcase() {
		
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
