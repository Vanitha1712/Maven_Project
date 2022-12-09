package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
	public Configuration_Reader() throws IOException {

		File f =new File("C:\\Users\\TESTUSER\\eclipse-workspace\\maven\\src\\main\\java\\com\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	
	  public String getInstanceUrl() {

		  String url = p.getProperty("url");
		  
		  return url;  
	}
	  public String getInstanceUsername() {

		  String username = p.getProperty("username");
		  
		  return username;  
	}
	  public String getInstancePassword() {

		  String password = p.getProperty("password");
		  
		  return password;  
	}
	  public String getInstanceCheckIn() {

		  String checkIn = p.getProperty("checkIn");
		  
		  return checkIn;  
	}
	  public String getInstanceCheckOut() {

		  String checkOut = p.getProperty("checkOut");
		  
		  return checkOut;  
	}
	  public String getInstanceFirstName() {

		  String firstName = p.getProperty("firstName");
		  
		  return firstName;  
	}
	  public String getInstanceLastName() {

		  String lastName = p.getProperty("lastName");
		  
		  return lastName;  
	}
	  public String getInstanceAddress() {

		  String address = p.getProperty("address");
		  
		  return address;  
	}
	  public String getInstanceCreditNo() {

		  String creditNo = p.getProperty("creditNo");
		  
		  return creditNo;  
	}
	  public String getInstanceCv() {

		  String cv = p.getProperty("cv");
		  
		  return cv;  
	}
	  public String getInstanceScreenshotLocation() {

		  String screenshotLocation = p.getProperty("screenshotLocation");
		  
		  return screenshotLocation;  
	}
}
