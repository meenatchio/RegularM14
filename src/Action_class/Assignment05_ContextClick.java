package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment05_ContextClick
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.contextClick(right_click).build().perform();
		WebElement click = driver.findElement(By.xpath("//span[text()='Delete']"));
		a.contextClick(click).build().perform();
		try
		{
	  		click.isEnabled();
			System.out.println("my script is unsuccessfull");
		}
		catch(Exception e)
		{
			System.out.println("my script is successfull");
		}
		driver.close();
}
}
