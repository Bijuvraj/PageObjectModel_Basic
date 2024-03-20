package pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement datepickers;
	@FindBy(xpath = "//label[text()='Enter Date']")
	WebElement header;
	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement enterDate;
	@FindBy(xpath = "(//th[@class='prev'])[1]")
	WebElement previousBtn;
	@FindBy(xpath = "(//th[@class='next'])[1]")
	WebElement nextBtn;
	@FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
	WebElement currentDate;
	@FindBy(xpath = "(//span[@class='input-group-text'])[1]")
	WebElement calender;
	public DatePickersPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnDatePickers()
	{
		datepickers.click();
	}
	public String getHeaderText()
	{
		return(header.getText());
	}
	public void chooseDate(String date)
	{
		String split[]=date.split("-");
		String day = split[0];
		String year = split[2];
		int m = Integer.parseInt(split[1]);
		int y = Integer.parseInt(split[2]);
		String month="";
		switch (m) {
				case 01:
					month = "January";
					break;
				case 2:
					month = "February";
					break;
				case 3:
					month = "March";
					break;
				case 4:
					month = "April";
					break;
				case 5:
					month = "May";
					break;
				case 6:
					month = "June";
					break;
				case 7:
					month = "July";
					break;
				case 8:
					month = "August";
					break;
				case 9:
					month = "September";
					break;
				case 10:
					month = "October";
					break;
				case 11:
					month = "November";
					break;
				case 12:
					month = "December";
					break;
				default:
					break;
				}
			
		calender.click();
		String month_Year=month+" "+year;
		while(true)
		{
			String currentmonth = currentDate.getText();
			if(currentmonth.equals(month_Year))
			{
				break;
			}
			else if (y==2024)
			{
				if(m<2)
				{
					previousBtn.click();
				}
				else 
				{
					nextBtn.click();
				}
			}
			else if (y< 2024)
			{
				previousBtn.click();
			}
			else if(y>2024)
			{
				nextBtn.click();
			}
			}
		WebElement element = driver.findElement(By.xpath("//td[text()='"+day+"'and@class='day']"));
		element.click();
		}
	
}
