package pages;

import Test.Ebay;

public class SignInPage extends Ebay {
	public CheckOutPage clickContinueAsGuest()
	{
		driver.findElementByXPath("//button[@id='gtChk']").click();
		return new CheckOutPage();
	}
}
