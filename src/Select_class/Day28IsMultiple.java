package Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day28IsMultiple {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("file:///C:/Users/HP/Downloads/demo-1.html");
	   WebElement single_dropdown = driver.findElement(By.xpath("//select[@id='standard_cars']"));
	   WebElement multiple_dropdown = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
	   Select s1=new Select(single_dropdown);
	   Select s2=new Select(multiple_dropdown);
	   if(s1.isMultiple())
	   {
		   System.out.println("You are in s1 dropdown menu");
		   List<WebElement> s1values = s1.getOptions();
		   for(WebElement web:s1values)
		   {
			   web.click();
			   Thread.sleep(2000);
		   }
		   s1.deselectAll();
	   }
	   else
	   {
		   System.out.println("You are in s2 dropdown menu");
		   List<WebElement> s2values = s2.getOptions();
		   for(WebElement web:s2values)
		   {
			   web.click();
			   Thread.sleep(2000);
		   }
		   s2.deselectAll();
	   }
}
}
