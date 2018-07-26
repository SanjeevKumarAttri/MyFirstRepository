package pom.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
	
	@Test
	public void LoginValid() {
		String ER = "Tested";
		String AR = "Tested";
		Assert.assertEquals(AR, ER);	
	}
	
	@Test
	public void LoginInValid() {
		String ER = "Tested";
		String AR = "Tested";
		Assert.assertEquals(AR, ER);
	}
}
