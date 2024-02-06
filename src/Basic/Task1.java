package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] meena)
	{
		
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    driver.navigate().to("https://www.redbus.in/");
	    driver.navigate().back();
	    driver.navigate().refresh();
	    String current_url=driver.getCurrentUrl();
	    String given_url="https://demowebshop.tricentis.com";
	    System.out.println(driver.getCurrentUrl());
	    if(current_url.equals(given_url))
	    {
	    	System.out.println("url is same");
	    }
	    else
	    {
	    	System.out.println("url is not same");
	    }
	    driver.close();
	}
}
