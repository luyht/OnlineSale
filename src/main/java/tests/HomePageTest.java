package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.IndexPage;
import pages.RegisterPage;

public class HomePageTest extends TestCase{
	//TC1- Navigate to Register page
	@Test (description="Navigate to Register page")
	public void navigateToRegisterPage() {
		IndexPage indexPage = new IndexPage(testBase.driver);		
		RegisterPage registerPage = indexPage.clickEnterImg();
		String actualCurrentUrl = registerPage.getCurrentUrl();
		assertTrue(actualCurrentUrl.contains("Register.html"));
	}

}
