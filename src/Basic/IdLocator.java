package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] meena) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	    Thread.sleep(2000);
	    driver.quit();
	}

}
