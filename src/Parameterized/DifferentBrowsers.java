package Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers 
{
	WebDriver driver;
	@Parameters("Driver")
@Test
public void browsers(String div)//div means edge
{
	if(div.equalsIgnoreCase("chrome"))//edge is equal to chrome or not  not right so to nxt condition
	{
		driver=new ChromeDriver();
		System.out.println("hii iam from chrome driver");
		Reporter.log("chromedriver");
	}
	else if(div.equalsIgnoreCase("edge"))//edge is equal to edge or not crt so execute
	{
		driver=new EdgeDriver();
		System.out.println("hii iam from edge driver");
		Reporter.log("edgedriver");
	}
	else if(div.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		System.out.println("hii iam from firefox driver");
		Reporter.log("firefoxdriver");
	}
	else
	{
		System.out.println("driver is not found");
	}
}
}
