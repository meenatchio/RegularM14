package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day27Single_select {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("file:///C:/Users/HP/Downloads/demo-1.html");
	    Thread.sleep(2000);
	   WebElement single_select = driver.findElement(By.cssSelector("select[id='standard_cars']"));
	   Select s_ref=new Select(single_select);
	   s_ref.selectByVisibleText("Mercedes");// selectbyvisibletext
	   Thread.sleep(2000);
	   s_ref.selectByValue("hda");// selectbyvalue
	   Thread.sleep(2000);
	   s_ref.selectByIndex(9); // selectbyindex
	   Thread.sleep(2000);
	   driver.close();;

}
}