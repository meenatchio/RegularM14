package JavaScript;

import java.io.IOException;
import java.time.Duration;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisableClick {
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement download_link = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.zip"));
		js.executeScript("arguments[0].scrollIntoView(false);", download_link);
		download_link.click();
		WebElement disable_button = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.zip"));
		js.executeScript("arguments[0].click();", disable_button);  //is not enable checkbox but open the page but manually to this is not working
		
}
}
