package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ListBoxPage;

public class ListBoxTest extends BaseClass{
ListBoxPage listbox;
@Test
public void listBox()
{
	listbox = new ListBoxPage(driver);
	listbox.clickOnTheListBox();
}
}
