package pages;

import Test.Ebay;

public class Homepage extends Ebay{
	public Homepage selectCategory()
	{
		driver.findElementById("gh-shop-a").click();
		return this;
	}
	public computerTabletPage selectLaptop()
	{
		driver.findElementByXPath("//a[text()='Computers & tablets']").click();
		return new computerTabletPage();
	}

}
