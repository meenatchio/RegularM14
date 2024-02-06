package PopUp;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day17AssignmentRedBus {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		ChromeOptions chrome_option=new ChromeOptions();
		chrome_option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chrome_option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.redbus.in");
		Actions act=new Actions(driver);
		driver.findElement(By.id("src")).sendKeys("Bangalore"); //type the place
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']"))); //list is visible then inspect
		act.keyDown(Keys.ENTER).build().perform();  // enter that element
		driver.findElement(By.id("dest")).sendKeys("Chennai");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
		act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.cssSelector("div[class='labelCalendarContainer']")).click(); //first click that calender
		driver.findElement(By.xpath("//span[text()='20']")).click(); //inspect that 20 and click
		Thread.sleep(2000);
		driver.findElement(By.id("search_button")).click(); //click search button
	}
}
