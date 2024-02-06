package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {
	public static void main(String[] meena) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://www.redbus.in/");
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    driver.close();
	}
}
