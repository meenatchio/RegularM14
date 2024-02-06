package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popUp {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I); //19 to 23 lines username
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB); // nxt tab for ex: go to password
		Thread.sleep(2000);
	    r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_M);  //release
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);    //password
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);   //go to nxt signup tab
        r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_M);    //go to release the password
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_ENTER);   //enter signup page
		
		

}
}
