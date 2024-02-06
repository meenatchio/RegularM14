package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11Assignment2 {
	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		String given_logintitle="Demo Web Shop. Login";
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
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
				    driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
				    driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();//(".button-1.login-button)
				    Thread.sleep(2000);
				    driver.close();
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
}
