package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22Assignment_UsingForLoop {
	public static void main(String[] args) throws InterruptedException
	{
		String given_Text="Featured products";
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    WebElement featured_product = driver.findElement(By.xpath("//strong[text()='Featured products']"));
	    String current_Text=featured_product.getText();
	    System.out.println(current_Text);
	    if(given_Text.equalsIgnoreCase(current_Text))
	    {
	    	 System.out.println("Entering into DWS webpage");
	    	 List<WebElement> products = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/ul/li/a"));
	    	 for(int i=0;i<products.size();i++)
	    	 {
	    		 String text=products.get(i).getText();
	    		 Thread.sleep(2000);
	    		 System.out.println(text);
	    	 }
	    	 driver.close();
	    }
	    else
	    {
	    	System.out.println("Entering into not DWS webpage");
	    }
}
}