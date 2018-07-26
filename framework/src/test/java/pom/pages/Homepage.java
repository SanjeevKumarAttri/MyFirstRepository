package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	WebDriver d1;
	@FindBy(linkText="Register")
	WebElement LinkReg;

	public void Clickregistration(){
		LinkReg.click();

	}

	public Homepage(WebDriver driver)
	{
		this.d1=driver;


	}

}
