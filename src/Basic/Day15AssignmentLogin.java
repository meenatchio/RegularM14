package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15AssignmentLogin {
	public static  WebDriver driver=null;
	public static void ChromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void Login()
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_logintitle="Demo Web Shop. Login";
		driver.get("https://demowebshop.tricentis.com/");
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url))
	    {
	    	System.out.println("Url is same");
	    	driver.findElement(By.className("ico-login")).click();
		    String current_logintitle=driver.getTitle();
		    System.out.println(driver.getTitle());
			if(given_logintitle.equals(current_logintitle))
		      {
			     System.out.println("Title is same");
			     driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("omeenatchi2001@gmail.com");
				    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Meena@2001");
				    driver.findElement(By.cssSelector("#RememberMe")).click();
				    driver.findElement(By.cssSelector(".button-1.login-button")).click();
			  }
			else
			    {
			    	System.out.println("Title is not same");
			    }
	    }
	    else
	    {
	    	System.out.println("Url is not same");
	    }
	}
	public static void CloseBrowser()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeBrowser();
		Login();
		Thread.sleep(2000);
		CloseBrowser();
	}
}
