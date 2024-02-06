package PopUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11Assignment {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		/*Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(right_click).contextClick(right_click).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		Alert a=driver.switchTo().alert();
		a.accept();*/
		Thread.sleep(2000);
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for(WebElement web:option)
		{
			System.out.println(web.getText());
			Actions act=new Actions(driver);
			act.moveToElement(right_click).contextClick(right_click).build().perform();
			Thread.sleep(1000);
			web.click();
			Thread.sleep(2000);
			Alert a=driver.switchTo().alert();
			Thread.sleep(1000);
			System.out.println(a.getText());
			a.dismiss();
			Thread.sleep(2000);
			
		}
		
		
}
}

