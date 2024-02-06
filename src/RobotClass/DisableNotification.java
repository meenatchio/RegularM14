package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		ChromeOptions c_option=new ChromeOptions();
		c_option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(c_option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
		

}
}
