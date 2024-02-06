package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18AssignmentGiftCard_xpath {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[7]/a")).click();//open the gift card page
	    
}
}
