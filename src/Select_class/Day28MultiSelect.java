package Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day28MultiSelect {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("file:///C:/Users/HP/Downloads/demo-1.html");
	    Thread.sleep(2000);
	    WebElement multidropdown = driver.findElement(By.id("multiple_cars"));
		Select s_ref=new Select(multidropdown);
	    List<WebElement> web = s_ref.getOptions();// select total drop down menu
		for(WebElement a:web)
		{
			a.click();
			System.out.println(a.getText());
		}

}
}

//or
/*s_ref.selectByVisibleText("Select car:");
s_ref.selectByValue("aud");
s_ref.selectByIndex(2);
s_ref.selectByVisibleText("Ford");
s_ref.selectByValue("hda");
s_ref.selectByIndex(5);
s_ref.selectByVisibleText("Land Rover");         
s_ref.selectByValue("merc");
s_ref.selectByIndex(8);
s_ref.selectByVisibleText("Nissan");
s_ref.selectByValue("toy");
s_ref.selectByIndex(11);*/
