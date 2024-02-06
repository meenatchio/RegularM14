package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] meena)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.navigate().to("https://demowebshop.tricentis.com/");
	    driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobile");
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	}
}
