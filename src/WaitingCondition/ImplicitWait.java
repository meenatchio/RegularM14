package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Meenatchi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("O");
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		WebElement store=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if(store.isDisplayed())
		{
			System.out.println("You are in login page");
		}
		else
		{
			System.out.println("You are not in login page");
		}
	}

}
