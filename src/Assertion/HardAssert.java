package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void dws()
{
	    String given_url="https://demowebshop.tricentis.com/";
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		//Assert.assertEquals(given_url, current_url); //open demowebshop page and close
		Assert.assertNotEquals(given_url, current_url);//open demowebshop but not close url is not same terminate the pgm
		System.out.println("successfull");
		driver.quit();
}
}
