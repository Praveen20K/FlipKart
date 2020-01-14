package pages;

import Test.Ebay;

public class LaptopNetbookPage extends Ebay{
	public AppleLaptopPage selectApple()
	{
		driver.findElementByXPath("//p[text()='Apple']").click();
		return new AppleLaptopPage();
	}

}
