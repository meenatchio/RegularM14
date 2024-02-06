package Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerNavigate {
	public static void main(String[] meena)
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.navigate().to("https://www.ktmindia.com");//navigate method access particular webpage and forward and backward
	    String current_titlektm=driver.getTitle();
	    driver.get("https://www.royalenfield.com/");//get method only fetch the particular webpage
	    driver.navigate().back();
	    String given_titlektm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors";
	    System.out.println(driver.getTitle());
	    if(current_titlektm.contains(given_titlektm))
	    {
	    	System.out.println("you are in ktm webpage");
	    }
	    else
	    {
	    	System.out.println("you are in royalenfield webpage");
	    }
	    driver.navigate().forward();
	}

}
