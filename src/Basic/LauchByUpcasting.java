package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchByUpcasting {
	
		public static void main(String[] meena)
		{
			String s="https://www.qspiders.com/";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();//maximize the browser
		    driver.get("https://www.qspiders.com/");
		    String s1=driver.getCurrentUrl();
		    System.out.println(driver.getCurrentUrl());
		    if(s.equals(s1))
		    {
		    	System.out.println("URL is same");
		    }
		    else
		    {
		    	System.out.println("URL is not same");
		    }
		    driver.close();
		}
}

