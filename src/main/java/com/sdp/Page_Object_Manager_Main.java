package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.LogOut_Page;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager_Main {

	public WebDriver driver;
	
	private Login_Page lp;
	
	public Page_Object_Manager_Main(WebDriver driver2) {

		this.driver=driver2;	
	}

	public Login_Page getInstanceLogin() {
        if (lp==null) {
	
	    lp = new Login_Page(driver);
		
	    }
        return lp;
  }
	private Search_Hotel sh;
	
	public Search_Hotel getInstanceSearch() {

		if (sh==null) {
			
		 sh = new Search_Hotel(driver);
		    }
	        return sh;
	}
    private Select_Hotel sel;
	
	public Select_Hotel getInstanceSelect() {

		if (sel==null) {
		 sel = new Select_Hotel(driver);
		    }
	        return sel;
	}
	 private Book_Hotel bh;
		
	 public Book_Hotel getInstanceBook() {

			if (bh==null) {
		 bh = new Book_Hotel(driver);
			
			}
		        return bh;
		}
	
	 private LogOut_Page lop;
		
	 public LogOut_Page getInstanceLogOut() {

			if (lop==null) {
		 lop = new LogOut_Page(driver);
			
			}
		        return lop;
		}
	
	 
	
}
