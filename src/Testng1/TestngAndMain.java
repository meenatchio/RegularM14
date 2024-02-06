package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngAndMain {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();    //goto runAs and click javaapplication means main method execute
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
    driver.quit();
}
@Test
public void royalenfield(){
	WebDriver driver=new ChromeDriver();   //goto runas and testng means this method execute
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.get("https://www.royalenfield.com/");
    driver.quit();
}
}
