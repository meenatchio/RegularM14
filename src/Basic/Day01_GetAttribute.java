package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_GetAttribute {
	public static void main(String[] args)
	{
		String id="small-searchterms";
	WebDriver driver=new ChromeDriver();//open the browser
    driver.manage().window().maximize();//maximize the browser
    driver.get("https://demowebshop.tricentis.com/");
    WebElement search_field=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
    String attribute_value=search_field.getAttribute("id");
    System.out.println(attribute_value);
    if(id.equals(attribute_value))
    {
        System.out.println("our script is correct");
    }
    else
    {
    	 System.out.println("check for script......");
    }
    driver.close();
}
}
