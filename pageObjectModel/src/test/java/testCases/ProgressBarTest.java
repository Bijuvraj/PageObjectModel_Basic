package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProgressBarPage;

public class ProgressBarTest extends BaseClass{
	ProgressBarPage progressbar;
	@Test
	public void getTextOfProgressBar() throws InterruptedException
	{
		progressbar = new ProgressBarPage(driver);
		progressbar.clickOnProgressBars();
		String expectedResult = "PROGRESS BARS";
		String actualResult = progressbar.getTextOfProgressBar();
		Assert.assertEquals(actualResult, expectedResult);
		progressbar.clickOnStartButton();
		
	}
}
