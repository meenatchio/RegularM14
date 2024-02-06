package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19Assignment_xpathbyAttribute {
	public static WebDriver driver;
	 static String given_url="https://demowebshop.tricentis.com/";
	 static String given_title="Demo Web Shop. $25 Virtual Gift Card";
	public static void ChromeBrowser()//one method
	{
	driver=new ChromeDriver();//open the browser
	driver.manage().window().maximize();//maximize the browser
	}
	public static void virtualgiftcard()//2nd method
	{
    driver.navigate().to("https://demowebshop.tricentis.com");
    String current_url=driver.getCurrentUrl();
    //String[]name={"meenatchi","omeenatchi2001@gmail.com","meenatchi","omeenatchi2001@gmail.com"};
    if(given_url.equals(current_url))
    {
    	System.out.println("Demo web shop url is same");
    	driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
    	//driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click(); 6elements are there so use ()[1] above step25
    	String current_title=driver.getTitle();
    	if(given_title.contains(current_title))
    	{
    		System.out.println("virtual gift card title is same");
    		driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Meenatchi");
    		//List<WebElement> gift_field=driver.findElements(By.xpath(//div[@class='giftcard']/div/input"));
    		//int i=0;
    		//for(WebElement web:gift_field)
    		//{
    		//  web.sendKeys(name[i++]);
    		//}
    		driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("omeenatchi2001@gmail.com");//this to
    		driver.findElement(By.xpath("//input[@id='giftcard_2_SenderName']")).sendKeys("Meenatchi");
    		driver.findElement(By.xpath("//input[@id='giftcard_2_SenderEmail']")).sendKeys("omeenatchi2001@gmail.com");//this above comments
    		driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Hello!!!");
    		WebElement qty=driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));//quantity
    		qty.clear();//clear the quantity
    		qty.sendKeys("3");//then add the quantity
    		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
    		driver.findElement(By.partialLinkText("Shopping")).click();
    		//driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();  above step 46
    		 String given_shoppingtitle="Demo Web Shop. Shopping Cart";
    		 String current_shoppingtitle=driver.getTitle();
    		 if(given_shoppingtitle.contains(current_shoppingtitle))
    		 {
    			 System.out.println("Shopping card title is same");
    			 driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
    			 driver.findElement(By.xpath("//input[@name='updatecart']")).click();
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
	public static void main(String[] args)
	{
		ChromeBrowser();
		virtualgiftcard();
		CloseBrowser();
	}
}
