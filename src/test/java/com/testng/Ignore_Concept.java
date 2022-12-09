package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void briyani() {

		System.out.println("briyani");
	}
	@Test
	public void chickenBurger() {

		System.out.println("chickenBurger");
	}
	@Test
	public void frenchFries() {

		System.out.println("frenchFries");
	}
	@Test(enabled = false)
	public void popcorn() {

		System.out.println("popcorn");
	}
	@Ignore
	@Test
	public void curdRice() {

		System.out.println("curdrice");
	}
	@Test
	public void pizza() {

		System.out.println("pizza");
	}
}
