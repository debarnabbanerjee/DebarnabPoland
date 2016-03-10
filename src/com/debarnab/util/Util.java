package com.debarnab.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Util {
	
	private static Properties prop=null;
	private static Logger APP_LOG =null;
	
	private static void loadLogger(){
		APP_LOG = Logger.getLogger("devpinoyLogger");		
	}
	
	private static void loadPropFiles(){
		try{
			loadLogger();
			prop = new Properties();
			FileInputStream ip = new FileInputStream(new File(System.getProperty("user.dir")+"//proper.properties"));
			prop.load(ip);
		}catch(Exception e){
			APP_LOG.debug("Unable to load the properties File");
		}
		
	}
	
	private static void createFolder(String path){
		loadPropFiles();
		
		
	}

}
