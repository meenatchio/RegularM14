package Testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartByChronologicalOrder {
	public WebDriver driver;
	@BeforeClass
	public void openTheBrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod(enabled= false) //false means it will skip that method not executed (or) true means method will executed
	public void login()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("omeenatchi2001@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("meena@2001");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	@Test
	public void addtocart()
	{
		System.out.println("successfull.....");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	}
	@AfterMethod(enabled= false)  //false means it will skip that method not executed
	public void logout()
	{
		driver.findElement(By.className("ico-logout")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
