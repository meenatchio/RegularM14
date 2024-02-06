package Basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class GetTitle {
	public static void main(String[] meena)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");
	    String given_title="Demo Web Shop";
	    System.out.println(driver.getTitle());
	    String current_title=driver.getTitle();
	    if(given_title.equals(current_title))
	    {
	    	System.out.println(" the given and current title is same");
	    }
	    else
	    {
	    	System.out.println(" the given and current title is not same");
	    }
	}
}
