package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexPage extends Page{
	public By iconEnterImg = By.id("enterimg");
		
	public IndexPage(WebDriver dr) {
		//super(dr);
		driver = dr;
	}

	public RegisterPage clickEnterImg() {
		testBase.clickOnElement(iconEnterImg);
		return new RegisterPage(driver);

	}

}
