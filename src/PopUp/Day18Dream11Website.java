package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day18Dream11Website {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions chrome_options=new ChromeOptions();
		chrome_options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chrome_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0);   int type index starts from 0
		driver.switchTo().frame("send-sms-iframe");   //string type id pass
		//WebElement iframe = driver.findElement(By.className("send-sms-iframe"));
		//driver.switchTo().frame("iframe");                  // pass webelement  point to embadded page
		driver.findElement(By.id("regEmail")).sendKeys("6381141091");  
		Thread.sleep(2000);
		driver.switchTo().parentFrame();  //(or) defaultContent use  go to parent page
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hamburger']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
}
}