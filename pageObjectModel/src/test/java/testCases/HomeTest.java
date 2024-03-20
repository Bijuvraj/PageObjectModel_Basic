package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {
	HomePage homepage;
	
	
@Test
public void verifyTheLogo()
{
	homepage = new HomePage(driver);
	System.out.println(driver.getTitle());
	homepage.printcurrentUrl();
	homepage.isLogoDisplayed();
}


}
