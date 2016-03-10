package com.debarnab.util;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class Customutil {
	
	private static Properties prop=null;
	private static Logger APP_LOG =null;
	private static File dir =null;
	private static SimpleDateFormat sdf =null;
	private static Date d =null;
	
	public static void loadLogger(){
		APP_LOG = Logger.getLogger("devpinoyLogger");		
	}
	
	public static void loadPropFiles(){
		try{
			loadLogger();
			prop = new Properties();
			FileInputStream ip = new FileInputStream(new File(System.getProperty("user.dir")+"//project.properties"));
			prop.load(ip);
			APP_LOG.debug("Loaded the properties File");
		}catch(Exception e){
			APP_LOG.debug("Unable to load the properties File");
		}		
	}
	
	public static void createFolder(){
		try{
			loadPropFiles();
			sdf = new SimpleDateFormat("EEE MMM dd HH-mm-ss zzz yyyy");
			String text = sdf.format(new Date()).toString();
			//dir = new File(System.getProperty("user.dir")+"//Automtion Report_"+text);
			dir = new File(System.getProperty("user.dir")+"//"+prop.getProperty("resultLocation")+text);
			dir.mkdir();
			File f = new File(System.getProperty("user.dir")+"//"+prop.getProperty("resultLocation")+text+"//automation.log");
			File source = new File("C:\\Users\\Debarnab\\workspace\\AutomationTesting\\src\\com\\debarnab\\LogFiles\\Application.log");
			//File dest = new File(System.getProperty("user.dir")+"//"+prop.getProperty("resultLocation")+text);
			FileUtils.copyFile(source, f);
		}catch(Exception e){
			APP_LOG.debug("Unable to copy log file" + e.getMessage());
		}
	}
	
	
}
