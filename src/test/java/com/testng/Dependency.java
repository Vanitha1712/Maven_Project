package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {

	@Ignore
	@Test
	public void credencials() {

		System.out.println("credencials");
	}
	@Test(dependsOnMethods = "credencials")
	public void login() {

		System.out.println("login");
	}
}
