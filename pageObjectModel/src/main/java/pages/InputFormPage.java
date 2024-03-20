package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utitity.UtilityClass;

public class InputFormPage {
	WebDriver driver;
	By inputForm = By.xpath("//a[contains(text(),'Input Form')]");
	By showMsgBtn = By.xpath("//button[text()='Show Message']");
	By getTotalBtn= By.xpath("//button[text()='Get Total']");
	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}
	UtilityClass utility = new UtilityClass();
	public void clickOnInputForm()
	{
		WebElement element = driver.findElement(inputForm);
		element.click();
	}
	public String getShowMsgButtonText()
	{
		WebElement element = driver.findElement(showMsgBtn);
		return(element.getText());
	}
	public String getTotalButtonText()
	{
		WebElement element = driver.findElement(getTotalBtn);
		return(element.getText());
	}
	public void checkUtility()
	{
		WebElement element = driver.findElement(showMsgBtn);
		System.out.println(utility.get_Attribute(element, "class"));  //1st WebEle 2nd Attribute name
	}
}
