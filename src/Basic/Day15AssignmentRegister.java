package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15AssignmentRegister {
	public static  WebDriver driver=null;
	public static void ChromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void Register()
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_registertitle="Demo Web Shop. Register";
		driver.get("https://demowebshop.tricentis.com/");
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url))
	    {
	    	System.out.println("Url is same");
	    	driver.findElement(By.className("ico-register")).click();
		    String current_registertitle=driver.getTitle();
		    System.out.println(driver.getTitle());
			if(given_registertitle.equals(current_registertitle))
		      {
			     System.out.println("Title is same");
			     driver.findElement(By.cssSelector("input[id='gender-female']")).click();
				    driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Meenatchi");
				    driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("O"); //("#LastName")
				    driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("omeenatchi2001@gmail.com");
				    driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("Meena@2001");
				    driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Meena@2001");
				    driver.findElement(By.id("register-button")).click();
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
		Register();
		Thread.sleep(2000);
		CloseBrowser();
	}
}
