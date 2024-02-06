package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Assignment {
	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
		String given_shoppingtitle="Demo Web Shop. Shopping Cart";
	    WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url))
	    {
	    	System.out.println("Url is same");
	    	driver.findElement(By.linkText("Digital downloads")).click();
	    	String current_title=driver.getTitle();
	    	if(given_title.contains(current_title))
	    	{
	    		System.out.println("Digitaldownload Title is same");
	    		List<WebElement> community_pool = driver.findElements(By.cssSelector("input[class='button-2 product-box-add-to-cart-button']"));
	    		System.out.println(community_pool);
	    		for(WebElement web:community_pool)
	    		{
	    			web.click();
	    			Thread.sleep(2000);
	    		}
	    		driver.findElement(By.partialLinkText("Shopping")).click();
	    		String current_shoppingtitle=driver.getTitle();
	    		if(given_shoppingtitle.contains(current_shoppingtitle))
	    		{
	    			System.out.println("Shopping cart Title is same");
	    		}
	    		else
	    		{
	    			System.out.println("Shopping cart Title is not same");
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Digitaldownload Title is not same");
	    	}
	    }
	    else
	    {
	    	System.out.println("Url is not same");
	    }
	}
}
