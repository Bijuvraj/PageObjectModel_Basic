package testCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablepage;
	@Test
	public void verifyTheTextOfAllEmployee()
	{
		tablepage = new TablePage(driver);
		tablepage.clickonTheTable();
		tablepage.getAllEmployeesName();
		tablepage.getAllEmployeesOfficeName();
		tablepage.getAllDetailsOfTiger_Nixon();
		System.out.println(tablepage.getOfficeOfPerson("Brielle Williamson"));
	}
	@Test
	public void verifyAllEmployeesNames()
	{
		tablepage = new TablePage(driver);
		tablepage.clickonTheTable();
		tablepage.getAllEmployeesName();
		List<String> expectedResult = new ArrayList<String>();
		expectedResult.add("Tiger Nixon");
		expectedResult.add("Garrett Winters");
		expectedResult.add("Ashton Cox");
		expectedResult.add("Cedric Kelly");
		expectedResult.add("Airi Satou");
		expectedResult.add("Brielle Williamson");
		expectedResult.add("Herrod Chandler");
		expectedResult.add("Rhona Davidson");
		expectedResult.add("Colleen Hurst");
		expectedResult.add("Sonya Frost");
		List<String> actualResult = tablepage.getAllEmployeesName();
		System.out.println("Expected : "+expectedResult);
		Assert.assertEquals(actualResult,expectedResult);
	}
}
