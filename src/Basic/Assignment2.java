package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] meena)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.className("ico-register")).click();
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.name("FirstName")).sendKeys("Meenatchi");
	    driver.findElement(By.name("LastName")).sendKeys("O");
	    driver.findElement(By.name("Email")).sendKeys("omeenatchi2001@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("Meena@2001");
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("Meena@2001");
	    driver.findElement(By.id("register-button")).click();
	    driver.close();
	}
}
