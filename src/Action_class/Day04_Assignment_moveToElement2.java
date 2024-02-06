package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day04_Assignment_moveToElement2 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement kids = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Kids']")));
		Actions action=new Actions(driver);
		action.moveToElement(kids).perform();
		WebElement jeans=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Jeans'])[3]")));
		jeans.click();
}
}
