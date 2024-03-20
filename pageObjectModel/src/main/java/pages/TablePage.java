package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitity.UtilityClass;

public class TablePage {
	WebDriver driver;
	UtilityClass utility = new UtilityClass();
	@FindBy(xpath = "//a[contains(text(),'Table')]")
	WebElement table;
	@FindBy(xpath="//table/tbody/tr//td[1]")
	List<WebElement>allemployeesName;
	@FindBy(xpath = "//table[@id='dtBasicExample']//tbody/tr//td[3]")
	List<WebElement> allemployeeOffice;
	@FindBy(xpath = "//table[@id='dtBasicExample']//tbody/tr[1]//td")
	List<WebElement> tiger;
	public TablePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonTheTable()
	{
		table.click();
	}
	public List<String> getAllEmployeesName()
	{
		List<String> names = new ArrayList<String>();
		names = utility.getTextOfElements(allemployeesName);
		System.out.println(names);
		return names;
	}
	public void getAllEmployeesOfficeName()
	{
		List<String> office = new ArrayList<String>();
		office = utility.getTextOfElements(allemployeeOffice);
		System.out.println(office);
	}
	public void getAllDetailsOfTiger_Nixon()
	{
		List<String> employee1 = new ArrayList<String>();
		employee1 = utility.getTextOfElements(tiger);
		System.out.println(employee1);
	}
	public String getOfficeOfPerson(String employeeName)
	{
		List<String> names = new ArrayList<String>();
		names = utility.getTextOfElements(allemployeesName);
		int index = 0;
		for(index = 0; index < names.size();index ++)
		{
			if(employeeName.equals(names.get(index)))
			{
				index++;
				break;
			}
		}
		WebElement nameElement = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr["+index+"]//td[3]"));
		return (nameElement.getText());
	}
	
}
