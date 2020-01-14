package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class erail {
			// TODO Auto-generated method stub
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@placeholder='From*']").clear();
		driver.findElementByXPath("//input[@placeholder='From*']").sendKeys("TBM", Keys.ENTER);
		driver.findElementByXPath("//input[@placeholder='To*']").clear();
		driver.findElementByXPath("//input[@placeholder='To*']").sendKeys("CDM", Keys.ENTER);
		
	}

}
