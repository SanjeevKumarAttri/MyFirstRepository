package pom.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo_Cookies {
	WebDriver d;
	
  @Test
  public void Cookies() {
	  d.manage().deleteAllCookies();
	  Cookie c = new Cookie("Test","Mycookies");
	  d.manage().addCookie(c);
	  Set<Cookie> myset = d.manage().getCookies();
	  for(Cookie s :myset){
		  
		  System.out.println(s.getName());
		  System.out.println(s.getPath());
		  System.out.println(s.getDomain());
	  }	  
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\New folder\\framework\\Resources\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demowebshop.tricentis.com/register");
  }

  @AfterTest
  public void afterTest() {
  }

}
