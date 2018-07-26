package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	WebDriver d2;
	@FindBy(id="gender-male")
	static
	WebElement Gender;

	@FindBy(id="FirstName")
	static
	WebElement FirstName;

	@FindBy(id="LastName")
	static
	WebElement LastName;

	@FindBy(id="Email")
	static
	WebElement Email;

	@FindBy(id="Password")
	static
	WebElement Password;

	@FindBy(id="ConfirmPassword")
	static
	WebElement ConfirmPassword;

	@FindBy(id="register-button")
	static
	WebElement registerbutton;

	public static void registration(String F,String L,String E,String P,String CP){
		Gender.click();
		FirstName.sendKeys(F);
		LastName.sendKeys(L);
		Email.sendKeys(E);
		Password.sendKeys(P);
		ConfirmPassword.sendKeys(CP);
		registerbutton.click();
	}

	public Registration(WebDriver driver)
	{
		this.d2=driver;


	}

}
