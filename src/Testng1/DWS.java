package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS {
	@Test
public void dws()
{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	    Reporter.log("dws",true);//testng replace the s.o.p into reporter.log
	    driver.quit();
}
	@Test
	public void test1()
	{
		System.out.println("iam from test1");
	}
	@Test
	public void cat()
	{
		System.out.println("iam from cat");
	}
}
