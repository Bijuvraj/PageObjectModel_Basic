package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListBoxPage {
WebDriver driver;
@FindBy(xpath = "//a[contains(text(),'List Box')]")
WebElement listbox;
public ListBoxPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void clickOnTheListBox()
{
	listbox.click();
}
}
