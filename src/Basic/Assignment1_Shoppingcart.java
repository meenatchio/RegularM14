package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Shoppingcart {
	public static void main(String[] meena)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.partialLinkText("Shopping")).click();
	    
	}


}
