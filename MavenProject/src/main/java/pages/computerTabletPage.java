package pages;

import Test.Ebay;

public class computerTabletPage extends Ebay {
	public LaptopNetbookPage selectLaptopsNetbooks()
	{
		driver.findElementByXPath("//p[text()='Laptops & Netbooks']").click();
		return new LaptopNetbookPage();
	}

}
