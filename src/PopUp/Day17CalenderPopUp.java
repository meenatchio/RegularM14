package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day17CalenderPopUp {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.agoda.com/");
		Thread.sleep(2000);
		WebElement no_thanks=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
		no_thanks.click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-01-20']")).click();  //inspect date jan
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
		Thread.sleep(2000);
		WebElement next_month = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));  //>  
		Thread.sleep(2000);
		/*next_month.click(); //feb
		Thread.sleep(2000);
		next_month.click(); //march
		Thread.sleep(2000);
		next_month.click();  //april
		Thread.sleep(2000);*/
		try
		{
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click(); // inspect date may
		System.out.println("Script is successfull");
		}
		catch(Exception e)
		{
			next_month.click();   //feb,march,april,may 23 find means go to try block
		}
		}
}
