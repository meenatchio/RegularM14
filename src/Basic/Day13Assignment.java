package Basic;//verify the webElement

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13Assignment {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
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
	    			//(or)
	    			//List<WebElement> remove_check=driver.findElements(By.cssSelector("input[type='CheckBox']"));
	    			//remove.remove(3); static or remove_check.remove(remove_check.size()-1); dynamic
	    			//for(WebElement CheckBox:remove_check)
	    			//{
	    			//   CheckBox.click();
	    			//}
	    		 
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
}


