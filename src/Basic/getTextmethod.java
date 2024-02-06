package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextmethod {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com/");
	    WebElement register_text = driver.findElement(By.xpath("//a[@class='ico-register']"));//store it
	    System.out.println(register_text.getText());//o/p register webelement is get
	    driver.close();
}
}
