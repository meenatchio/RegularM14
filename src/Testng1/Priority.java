package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority= 0)
public void rayalenfield()
{
		WebDriver driver=new ChromeDriver();   
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/");
	    driver.quit();
}
	@Test(priority= 4)
	public void agoda()
	{
		WebDriver driver=new ChromeDriver();   
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
	    driver.quit();
	}
	@Test(priority= 2,invocationCount= 2,threadPoolSize= 2)
	public void dws()
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
		    driver.quit();
	}
	@Test(priority= 3)
	public void redbus()
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			driver.get("https://www.redbus.in/");
		    driver.quit();
	}
	@Test(priority= 1)
	public void bmw()
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			driver.get("https://www.bmw.in/");
		    driver.quit();
	}
	
	
}
