package pom.tests;

import org.testng.annotations.Test;
import com.accenture.utilities.ExcelUtility;
import pom.pages.Homepage;
import pom.pages.Registration;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class RegistrationTest {
	WebDriver d3;
	Homepage h;//declaration of object
	Registration r;
	ExcelUtility e;
	@Test
	public void Registrationtest() throws IOException {	
		h.Clickregistration();
		e.getTestData();
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\Desktop\\New folder\\framework\\Resources\\chromedriver.exe");
		d3= new ChromeDriver();
		d3.manage().window().maximize();
		d3.get("http://demowebshop.tricentis.com/");
		//		h=new Homepage();// normal initialization
		//PageFactory
		h = PageFactory.initElements(d3, Homepage.class);
		r= PageFactory.initElements(d3, Registration.class);
		e= new ExcelUtility();
	}
	@AfterTest
	public void afterTest() {
		
	}

}
