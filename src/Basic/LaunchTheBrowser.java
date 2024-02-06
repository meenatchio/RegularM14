package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
public static void main(String[] meena)
{
	ChromeDriver driver=new ChromeDriver();//open the browser
    driver.manage().window().maximize();//maximize the browser
    driver.get("https://demowebshop.tricentis.com");
    
}
}
