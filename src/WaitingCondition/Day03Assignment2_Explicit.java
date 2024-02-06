package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day03Assignment2_Explicit {
	public static void main(String[] args)throws InterruptedException
	{
		String given_url="https://www.facebook.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement button= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']")));
		button.click();
}
}