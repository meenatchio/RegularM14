package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSHomePage {
@Test
public void receiver()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWSHomePage execute=new DWSHomePage(driver); //object creating 
	//execute.searchField.sendKeys("meena");
	//execute.searchButton.click();
	//or
	execute.searchField("meena");
	execute.searchButton();
}
}
