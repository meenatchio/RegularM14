package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionOnMultipleWindows {
	public static void main(String[] args) throws InterruptedException
	{
		String given_TwitterTitle="nopCommerce (@nopCommerce) / X";
		WebDriver driver=new ChromeDriver();//open the browser
		driver.manage().window().maximize(); //maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//implicitlyWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//explicitlyWait
		driver.get("https://demowebshop.tricentis.com/");//enter into the page
		String parent=driver.getWindowHandle();//getting DWS page
		System.out.println(parent);
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();//scrolldown  the page 2 times
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		WebElement google = driver.findElement(By.xpath("//a[text()='Google+']"));
		Thread.sleep(2000);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));//wait for twitter to be visible
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();//open the twitter page in different window
		Thread.sleep(2000);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Google+']")));
		 a.moveToElement(google).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();//open the google page in different window
		Set<String> child = driver.getWindowHandles();//fetching all the handles
		System.out.println(child);//3 handles are present
		//child.remove(parent);
		for(String str:child)
		{
			driver.switchTo().window(str); //switch to controller goto twitter
			String current_TwitterTitle=driver.getTitle();
			if(given_TwitterTitle.contains(current_TwitterTitle))// twitter title is same means click on not now notification
			{
				driver.findElement(By.xpath("//span[text()='Not now']")).click();//click not now button in the notification
				Thread.sleep(5000);
				System.out.println("Script is successfull");
				driver.quit();// close the all the window
			}
		}
		
		
}
}
