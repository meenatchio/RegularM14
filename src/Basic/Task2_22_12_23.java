package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_22_12_23 {
	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
	    WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url))
	    {
	    	System.out.println("Url is same");
	    	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	    	Thread.sleep(2000);
	    	String current_title=driver.getTitle();
	    	if(given_title.contains(current_title))
	    	{
	    		System.out.println("Digitaldownload Title is same");
	    		driver.close();
	    	}
	    	else
	    	{
	    		System.out.println("Digitaldownload Title is not same");
	    	}
	    }
	    else
	    {
	    	System.out.println("Url is not same");
	    }

}

}
