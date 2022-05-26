package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Put all common methods which relate to Selenium
 * @author Luy
 *
 */
public class TestBase {
	public WebDriver driver;
	
	//Open single browser
	public void openWebsiteWithSingleBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\01Automation\\04Class\\202112\\AutomationTestingDemo\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("winedge")) {
			//new winedge driver
		}
		
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
	}
	//Left click
	public void clickOnElement(By locator) {
		WebElement e = driver.findElement(locator);
		int count =0;
		while(!e.isDisplayed() || count <20) {
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
		 if (e.isDisplayed()) {
			 e.click();
		 } else {
			 System.out.println("Element not found");
		 }
		
	}
	//Select in drop down box
	
	public void selectByValueOnDropDownBox(By locator, String value) {
		WebElement e = driver.findElement(locator);
		Select select = new Select(e);
		select.selectByValue(value);		
	}
	
	public void selectByTextOnDropDownBox(By locator, String selectedText) {
		WebElement e = driver.findElement(locator);
		Select select = new Select(e);
		select.selectByValue(selectedText);		
	}
	
	public void rightClickOnElement(By locator) {
		WebElement e = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.contextClick(e).build().perform();
		
	}
	public void scrollToEndPage() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public void getAlertMessage() {
		driver.switchTo().alert().getText();
		
	}
	
	
	
}
