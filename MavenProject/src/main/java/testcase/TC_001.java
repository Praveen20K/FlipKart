package testcase;

import org.testng.annotations.Test;

import Test.Ebay;
import pages.Homepage;

public class TC_001 extends Ebay {
	@Test
	public void testEbayPage()
	{
		 new Homepage()
		.selectCategory()
		.selectLaptop()
		.selectLaptopsNetbooks()
		.selectApple()
		.selectLaptop()
		.clickBuyNow()
		.clickContinueAsGuest()
		.reviewDetails();
	}

}
