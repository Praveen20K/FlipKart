package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ebay {
	public static ChromeDriver driver;
	@BeforeMethod
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	/*@AfterMethod
	public void end() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}*/

}
