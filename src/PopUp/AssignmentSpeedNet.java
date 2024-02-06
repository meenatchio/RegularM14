package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSpeedNet {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions chrome_options=new ChromeOptions();
		chrome_options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(chrome_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.speedtest.net/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='ns-3etvn-e-7']")).click();
		
}
}
