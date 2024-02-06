package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteAssignmentDWS {
	@Test
	public void receiver()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		AssignmentDWS execute=new AssignmentDWS(driver); //object creating
		execute.Register.click();
		execute.Login.click();
		execute.ShoppingCart.click();
		execute.Wishlist.click();
}
}
