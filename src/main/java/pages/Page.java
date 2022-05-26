package pages;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page {
	public WebDriver driver;
	public TestBase testBase = new TestBase();

//	public Page(WebDriver dr) {
//		driver = dr;
//	}
	
	//Go to Register page
	public void goToRegisterPage(String destinationPage) {
		driver.navigate().to(destinationPage);
	}
	
	
}
