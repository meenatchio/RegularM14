package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShotDWS {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;  //downcasting
		File from = ts.getScreenshotAs(OutputType.FILE);  //taking screenshot file type and to store file
		File to=new File("C:\\ScreenShots\\demoHomePage.png");  //storing that path last\\give name.png or jpg etc
		FileHandler.copy(from, to); //from mean screenshot and to mean store
}
}
