package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	InputFormPage inputformpage;
@Test
	public void verifyTheShowMsgButton()
	{
	inputformpage = new InputFormPage(driver);
	inputformpage.clickOnInputForm();
	String expectedResult = "Show Message";
	String actualResult = inputformpage.getShowMsgButtonText();
	Assert.assertEquals(actualResult, expectedResult);
	}
@Test
public void vetrifyGetTotalButtonText()
{
	inputformpage = new InputFormPage(driver);
	inputformpage.clickOnInputForm();
	inputformpage.checkUtility();
	String expectedResult = "Get Total";
	String actualResult = inputformpage.getTotalButtonText();
	Assert.assertEquals(actualResult, expectedResult);
}
}
