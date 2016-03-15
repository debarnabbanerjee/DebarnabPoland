package com.debarnab.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.debarnab.util.Customutil;

public class LoginTestCase extends Customutil{	
	@BeforeTest
	public void initialize(){		
		useMe();
		
	}
	
	@Test(dataProvider="getData")
	public void loginTestCase(String username,String password){		
		System.out.println("Username is " + username);		
		System.out.println("Passsord is " + password);
		
		writeLog("Credentials are --> " + username + " -- " + password);
		//writeLog("Credentials are " + username + " -- " + password);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "test1";
		obj[0][1] = "password1";
		
		obj[1][0] = "test2";
		obj[1][1] = "passwod2";
		
		return obj;			
	}
}
