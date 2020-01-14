package methods;

import Test.Ebay;
import cucumber.api.java.en.Given;

public class Ebaymethods extends Ebay {
	@Given("Search model by category")
	public void searchModelByCategory() 
	{
		driver.findElementById("gh-control").click();
	}

	@Given("Select Laptop category")
	public void selectLaptopCategory() 
	{
		driver.findElementByXPath("//a[text()='Computers & tablets']").click();
	}

	@Given("Select Laptops")
	public void selectLaptops() 
	{
		driver.findElementByXPath("//p[text()='Laptops & Netbooks']").click();
	}

	@Given("Select Apple")
	public void selectApple() 
	{
		driver.findElementByXPath("//p[text()='Apple']").click();
	}

	@Given("Select MacBook Pro")
	public void selectMacBookPro() 
	{
		String price = driver.findElementByXPath("(//li[@id='w7-items[10]']//following::span)[1]").getText();
		System.out.println("The Price of the product in INR: "+price);
		String deliveryprice = driver.findElementByXPath("(//li[@id='w7-items[10]']//following::span)[4]").getText();
		System.out.println("The Delivery Charge is: "+deliveryprice);
		driver.findElementByXPath("//h3[text()='Apple MacBook Pro 2016 13\" Touch Bar, i7 3.3GHz 16GB RAM 256GB SSD warranty']").click();
	}

	@Given("Print Price and Delivery Date")
	public void printPriceAndDeliveryDate() 
	{
		String deliverydate = driver.findElementByXPath("(//span[@class='vi-acc-del-range'])[1]").getText();
		System.out.println("The Delivery Date is: "+deliverydate);
		String PriceInUSD = driver.findElementByXPath("//span[@id='prcIsum']").getText();
		System.out.println("The Price in US Dollar: "+PriceInUSD);
		driver.findElementByXPath("//a[@id='binBtn_btn']").click();
	}

	@Given("click continue as guest")
	public void clickContinueAsGuest() 
	{
		driver.findElementByXPath("//button[@id='sbin-gxo-btn']").click();
	}

	@Given("Print the detail of the page")
	public void printTheDetailOfThePage() 
	{
		System.out.println("We are in the Payment Page");
	}

}
