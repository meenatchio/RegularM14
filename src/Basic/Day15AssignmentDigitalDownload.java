package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15AssignmentDigitalDownload {
	public static WebDriver driver;
	public static void ChromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void DigitalDownload() throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url))
	    {
	    	System.out.println("DemoWebShop Url is same");
	        WebElement store = driver.findElement(By.cssSelector("div[class='topic-html-content']"));
	        if(store.isDisplayed())
	       {
	    	System.out.println("yor are in welcomestore page");
	    	driver.findElement(By.linkText("Digital downloads")).click();
	    	 WebElement downloads = driver.findElement(By.cssSelector("div[class='page-title']"));
	    	if(downloads.isDisplayed())
	    	{
	    		System.out.println(" you are in Digitaldownload page");
	    		List<WebElement> community_pool = driver.findElements(By.cssSelector("input[class='button-2 product-box-add-to-cart-button']"));
	    		System.out.println(community_pool);
	    		for(WebElement web:community_pool)
	    		{
	    			web.click();
	    			Thread.sleep(2000);
	    		}
	    		driver.findElement(By.partialLinkText("Shopping")).click();
	    		WebElement shopping_cart = driver.findElement(By.cssSelector("div[class='page-title']"));
	    		if(shopping_cart.isDisplayed())
	    		{
	    			System.out.println("you are in Shopping cart page");
	    			List<WebElement> checkbox=driver.findElements(By.cssSelector("input[name='removefromcart']"));
	    			for(WebElement web:checkbox)
	    			{
	    				web.click();
	    				Thread.sleep(2000);
	    			}
	    			driver.findElement(By.cssSelector("input[name='updatecart']")).click();
	    		}
	    		else
	    		{
	    			System.out.println("you are not in Shopping cart page");
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("you are not in Digitaldownload page");
	    	}
	    }
	    else
	    {
	    	System.out.println("you are in not welcomestore page");
	    }
	   }
	   else
		    {
		    	System.out.println("DemoWebShop Url is not same");
		    }
 }
	public static void CloseBrowser()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeBrowser();
		DigitalDownload();
		Thread.sleep(2000);
		CloseBrowser();
	}

}
