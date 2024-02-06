package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day04_Assignment_moveToElement1 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions action=new Actions(driver);
		action.moveToElement(women).perform();
		driver.findElement(By.xpath("//a[text()='Sarees']")).click();
}
}
