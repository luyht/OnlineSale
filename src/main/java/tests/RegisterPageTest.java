package tests;

import org.testng.annotations.Test;

import pages.IndexPage;
import pages.RegisterPage;

public class RegisterPageTest extends TestCase{
	@Test (description="Register successfully - Way 1", groups="main")
	public void registerSuccessfully() {
		IndexPage indexPage = new IndexPage(testBase.driver);
		RegisterPage registerPage = indexPage.clickEnterImg();
		registerPage.inputFirstName("Luy");
		
	}
	
	@Test (description="Register successfully - Way 2")
	public void registerSuccessfully2() {
		//IndexPage indexPage = new IndexPage(testBase.driver);
		RegisterPage registerPage = new RegisterPage(testBase.driver);
		registerPage.goToRegisterPage("http://demo.automationtesting.in/Register.html");
		registerPage.inputFirstName("Luy");
		
	}

}
