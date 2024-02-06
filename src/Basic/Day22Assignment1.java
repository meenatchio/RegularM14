package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22Assignment1 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    List<WebElement> community_pool = driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li/a"));
	    for(WebElement web:community_pool)
	    {
	    	System.out.println(web.getText());
	    	Thread.sleep(2000);
	    }
	    driver.close();
	}
}
