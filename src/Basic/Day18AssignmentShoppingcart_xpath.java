package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18AssignmentShoppingcart_xpath {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/ul/li[3]/a/span[1]")).click();//open the shopping cart
	    
}
}
