package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sampleFlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement image = driver.findElementByXPath("//img[@class='_1e_EAo']");
		if (image.isDisplayed())
		{
		System.out.println("Image displayed.");
		}
		else
		{
		System.out.println("Image not displayed.");
		}
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		driver.findElementByXPath("//input[@title='Search for products, brands and more']").sendKeys("redmi note 7 pro");
		driver.findElementByClassName("vh79eN").click();
		List<WebElement> lis = driver.findElementsByXPath("//div[@class='_1vC4OE _2rQ-NK']");
		//List<String> pricelist = new ArrayList<String>();
		List<Integer> price= new ArrayList<Integer>();
		for(int i=0; i<lis.size(); i++)
		{
			//pricelist.add(lis.get(i).getText());
			String arr= lis.get(i).getText().replace("₹", "").replace(",", "");
			price.add(Integer.valueOf(arr));
		}
		List<Integer> sorted= new ArrayList<Integer>(price);
		Collections.sort(sorted);
		for(int i=sorted.size()-1; i>=0; i--)
		{
			System.out.println(sorted.get(i));
		}
		
	}
}
