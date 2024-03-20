package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage {
WebDriver driver;
@FindBy(xpath = "//a[contains(text(),'Progress Bars')]")
WebElement progress;
@FindBy(xpath = "//button[text()='Start Download']")
WebElement startbutton;
@FindBy(xpath = "(//button[text()='Close'])[2]")
WebElement close;
public ProgressBarPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void clickOnProgressBars()
{
	progress.click();
}
public String getTextOfProgressBar()
{
	System.out.println(progress.getText());
	return(progress.getText());
}
public void clickOnStartButton() throws InterruptedException
{
	startbutton.click();
	Thread.sleep(12000);
	close.click();
}
}
