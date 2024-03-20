package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickersPage;
import utitity.ExcelClass;

public class DatePickersTest extends BaseClass {
	DatePickersPage datepicker;
	ExcelClass excel;
	@Test
	public void verifyTheTextOfDatePickers()
	{
		datepicker = new DatePickersPage(driver);
		datepicker.clickOnDatePickers();
		datepicker.getHeaderText();
		String expectedresult = "Enter Date";
		String actualResult = datepicker.getHeaderText();
		Assert.assertEquals(actualResult, expectedresult);
	}
	@Test
	public void selectDate()
	{
		datepicker = new DatePickersPage(driver);
		datepicker.clickOnDatePickers();
		datepicker.chooseDate("17-10-2025");
	}
	@Test
	public void runExcel()
	{
		excel = new ExcelClass();
		excel.printValue();
		System.out.println(System.getProperty("user.dir"));
		
	}
}
