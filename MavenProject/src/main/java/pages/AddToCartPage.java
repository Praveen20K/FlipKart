package pages;

import Test.Ebay;

public class AddToCartPage extends Ebay{
	public SignInPage clickBuyNow()
	{
		String deliverydate = driver.findElementByXPath("(//span[@class='cc-ts-BOLD'])[1]").getText();
		System.out.println("The Delivery Date is: "+deliverydate);
		driver.findElementByXPath("//a[text()='Buy It Now']").click();
		return new SignInPage();
	}

}
