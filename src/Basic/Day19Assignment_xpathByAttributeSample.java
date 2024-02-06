package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19Assignment_xpathByAttributeSample 
{
public static WebDriver driver;
static String given_url="https://demowebshop.tricentis.com/";
static String given_title="Demo Web Shop. $25 Virtual Gift Card";
public static void ChromeBrowser()//one method
{
driver=new ChromeDriver();//open the browser
driver.manage().window().maximize();//maximize the browser
}
public static void virtualgiftcard() throws InterruptedException//2nd method
{
driver.navigate().to("https://demowebshop.tricentis.com");
String current_url=driver.getCurrentUrl();
if(given_url.equals(current_url))
{
	System.out.println("Demo web shop url is same");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click(); 
	String current_title=driver.getTitle();
	String[]name={"meenatchi","omeenatchi2001@gmail.com","meenatchi","omeenatchi2001@gmail.com"};
	if(given_title.contains(current_title))
	{
		System.out.println("virtual gift card title is same");
		Thread.sleep(2000);
		List<WebElement> gift_field=driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		Thread.sleep(2000);
		int i=0;
		for(WebElement Web:gift_field)
		{
		  Web.sendKeys(name[i++]);
		}
		driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Hello!!!");
		WebElement qty=driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));//quantity
		qty.clear();//clear the quantity
		qty.sendKeys("3");//then add the quantity
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		 String given_shoppingtitle="Demo Web Shop. Shopping Cart";
		 String current_shoppingtitle=driver.getTitle();
		 if(given_shoppingtitle.contains(current_shoppingtitle))
		 {
			 System.out.println("Shopping card title is same");
			 Thread.sleep(2000);
			 WebElement checkBox = driver.findElement(By.xpath("//input[@name='removefromcart']"));
			 checkBox.click();
			 if(checkBox.isSelected())
			 {
				 System.out.println("your checkbox is selected");
				 WebElement update_cart=driver.findElement(By.xpath("//input[@name='updatecart']"));
				 if(update_cart.isEnabled())
				 {
					 System.out.println("update cart click is successfull");
					 update_cart.click();
				 }
				 else
				 {
					 System.out.println("update cart click not is successfull"); 
				 }
				 
			 }
			 else
			 {
				 System.out.println("your checkbox is not selected");
			 }
			
		 }
		 else
		 {
			 System.out.println("Shopping card title is not same");
		 }
	}
	else
	{
		System.out.println("virtual gift card title is not same");
	}
	
}
else
{
	System.out.println("Demo web shop url is not same");
}
}
public static void CloseBrowser()//close the browser
{
	driver.close();
}
public static void main(String[] args) throws InterruptedException
{
	ChromeBrowser();
	virtualgiftcard();
	//CloseBrowser();
}
}


