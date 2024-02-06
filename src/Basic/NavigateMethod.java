package Basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class NavigateMethod {
	public static void main(String[] meena)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.navigate().to("https://www.ktmindia.com");//navigate method access particular webpage and forward and backward
	    driver.get("https://www.royalenfield.com/");//get method only fetch the particular webpage
	    driver.navigate().back();
	    driver.navigate().forward();
	}
}
