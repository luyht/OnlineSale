package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage extends Page {
	public By txtFirstName = By.xpath("//input[@placeholder='First Name']");
	public By txtLastName = By.xpath("//input[@placeholder='Last Name']");

	public RegisterPage(WebDriver dr) {
		driver=dr;
	}


	//Get current URL
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	//Input First Name
	public void inputFirstName(String firstName) {
		driver.findElement(txtFirstName).sendKeys(firstName);
	}
	//Input Last Name
	public void inputLastName(String lastName) {
		driver.findElement(txtLastName).sendKeys(lastName);
	}

}
