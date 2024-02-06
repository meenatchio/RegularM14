package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority= 1,dependsOnMethods="redbus") //without opening redbus agoda is not opening
	public void agoda()
	{
		WebDriver driver=new ChromeDriver();   
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
	    driver.quit();
	}
	@Test(priority= 2)
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
}
