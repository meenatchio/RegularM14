package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day05_Assignment_moveToElement {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement beauty = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Beauty']")));
		Actions action=new Actions(driver);
		action.moveToElement(beauty).perform();
		WebElement makeup=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Eyeliner']")));
		makeup.click();
}
}
