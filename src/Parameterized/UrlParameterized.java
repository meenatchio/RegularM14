package Parameterized;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UrlParameterized {
	@Parameters("URL")
@Test
public void dws(String dURL) //dURL means demowebshop url
{
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/"); //dURL is not wrking
		driver.quit();
}
	@Parameters("URL")
@Test
public void dws1(String dURL)
{
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("dURL");
		driver.quit();
}
}
