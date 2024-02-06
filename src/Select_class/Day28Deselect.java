package Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day28Deselect {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("file:///C:/Users/HP/Downloads/demo-1.html");
	    Thread.sleep(2000);
	    WebElement multidropdown = driver.findElement(By.id("multiple_cars"));
		Select s_ref=new Select(multidropdown);
	    List<WebElement> web = s_ref.getOptions();
		for(WebElement a:web)
		{
			a.click();
			//System.out.println(a.getText());
		}
        Thread.sleep(2000);
        s_ref.deselectAll(); //deselect all the option
}
}




