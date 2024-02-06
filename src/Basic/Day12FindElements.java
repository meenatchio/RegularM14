package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12FindElements {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> community_pool = driver.findElements(By.cssSelector("input[type='radio']"));
	    for(WebElement web:community_pool)//for each loop
	    {
	    	web.click();
	    	Thread.sleep(2000);
	    }
	    driver.close();
	    
	}
}
