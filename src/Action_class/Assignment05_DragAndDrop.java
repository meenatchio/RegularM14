package Action_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment05_DragAndDrop {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.xpath("//div[text()='Italy']"));
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement spain =driver.findElement(By.xpath("//div[text()='Spain']"));
		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement southkorea=driver.findElement(By.xpath("//div[text()='South Korea']"));
		WebElement capenhagen = driver.findElement(By.id("box4"));
		WebElement denmark=driver.findElement(By.xpath("//div[text()='Denmark']"));
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement unitedstate=driver.findElement(By.xpath("//div[text()='United States']"));
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement sweden=driver.findElement(By.xpath("//div[text()='Sweden']"));
		WebElement oslo= driver.findElement(By.id("box1"));
		WebElement norway=driver.findElement(By.xpath("//div[text()='Norway']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(rome,italy).build().perform();
		a.dragAndDrop(madrid,spain).build().perform();
		a.dragAndDrop(oslo,norway).build().perform();
		a.dragAndDrop(capenhagen,denmark).build().perform();
		a.dragAndDrop(seoul,southkorea).build().perform();
		a.dragAndDrop(stockholm,sweden).build().perform();
		a.dragAndDrop(washington,unitedstate).build().perform();
}
}
