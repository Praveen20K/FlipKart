package pages;

import Test.Ebay;

public class AppleLaptopPage extends Ebay {
	public AddToCartPage selectLaptop()
	{
		String price = driver.findElementByXPath("(//li[@id='w7-items[4]']//following::span)[6]").getText();
		System.out.println("The Price of the product in INR: "+price);
		String deliveryprice = driver.findElementByXPath("(//li[@id='w7-items[4]']//following::span)[9]").getText();
		System.out.println("The Delivery Charge is: "+deliveryprice);
		driver.findElementByXPath("(//li[@id='w7-items[3]']//following::h3)[1]").click();
		return new AddToCartPage();
	}

}
