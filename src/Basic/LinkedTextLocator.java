package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextLocator {
	public static void main(String[] meena)
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_logintitle="Demo Web Shop. Login";
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url))
	    {
	    	System.out.println("successfully entered");
	    	driver.findElement(By.linkText("Log in")).click();
	    	String current_logintitle=driver.getTitle();//store url in another string container
	        if(given_logintitle.contains(current_logintitle))//check if the url is same or not
	        {
		    	System.out.println("you are in login page");
		    	driver.close();
		    }
		    else
		    {
		    	System.out.println("you are not in login page ");
		    }
	    }
	    else
	    {
	     	System.out.println("Unsuccessfully");
	        
	    }
	    
	}

}
