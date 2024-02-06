package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day03Assignment_Explicit {
	public static void main(String[] args)throws InterruptedException
	{
		String given_url="https://www.facebook.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
		dropdown.click();
		WebElement facebook= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']")));
		facebook.click();
		/*if(dropdown.isDisplayed()) // verify the webElement create account
		{
			System.out.println("You are in facebook page");
			driver.navigate().back();
		}
		else
		{
			System.out.println("You are not in facebook page");
		}*/
		String current_url=driver.getCurrentUrl();  //  verify url facebook page
		if(given_url.equals(current_url))
		{
			System.out.println("You are in facebook page");
			driver.navigate().back();
		}
		else
		{
			System.out.println("You are not in facebook page");
		}
}
}
