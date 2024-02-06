package JavaScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor{
 public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://skillrary.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000);");// scroll down
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-1000);");//scroll littly down
		je.executeScript("window.scrollTo(0,1000);");//scroll littly down
		Thread.sleep(2000);
		je.executeScript("window.scrollTo(0,-1000);");//and again go up
}
}
