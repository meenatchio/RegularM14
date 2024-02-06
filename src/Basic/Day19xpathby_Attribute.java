package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19xpathby_Attribute {
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();//open the browser
	driver.manage().window().maximize();
    driver.navigate().to("https://demowebshop.tricentis.com");
    driver.findElement(By.xpath("//a[@class='ico-login']")).click();
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("omeenatchi2001@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Meena@2001");
    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}
}
