package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day27Assignment_Facebook {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("You are in facebook page");
			//driver.findElement(By.linkText("Create a new Facebook account.")).click();
			
		}
		else
		{
			System.out.println("You are not in facebook page");
		}
	}

}
