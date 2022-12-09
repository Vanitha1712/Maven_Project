package com.testng;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Non Veg")
	public void briyani() {

		System.out.println("briyani");
	}
	@Test(groups = "Non Veg")
	public void chickenBurger() {

		System.out.println("chickenBurger");
	}
	@Test(groups = "Non Veg")
	public void frenchFries() {

		System.out.println("frenchFries");
	}
	@Test(groups = "Veg")
	public void popcorn() {

		System.out.println("popcorn");
	}
	@Test(groups = "Veg")
	public void curdRice() {

		System.out.println("curdrice");
	}
	@Test(groups = "Veg")
	public void pizza() {

		System.out.println("pizza");
	}
	@Test(groups = "household")
	public void toys() {

		System.out.println("toys");
	}
	@Test(groups = "household")
	public void mobilePhones() {

		System.out.println("mobilePhones");
	}
	@Test(groups = "household")
	public void clothes() {

		System.out.println("clothes");
	}
}
