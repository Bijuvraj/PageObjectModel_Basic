package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logo = By.xpath("(//img[@src='images/logo.png'])[1]");
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
public void printcurrentUrl()
{
	System.out.println(driver.getCurrentUrl());
	WebElement logoimg = driver.findElement(logo);
	boolean b = logoimg.isDisplayed();
	System.out.println(b);
}
public boolean isLogoDisplayed()
{
	WebElement logoimg = driver.findElement(logo);
	//this.printcurrentUrl();
	return (logoimg.isDisplayed());
	
}
}
