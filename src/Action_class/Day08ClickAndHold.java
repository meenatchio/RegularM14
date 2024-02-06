package Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day08ClickAndHold {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement clickandhold = driver.findElement(By.id("box6"));
		Actions a=new Actions(driver);
		a.clickAndHold(clickandhold).build().perform();  //click and hold that element
		WebElement release=driver.findElement(By.xpath("//div[text()='Italy']"));
		a.moveToElement(release).click().build().perform(); //release that element
}
}