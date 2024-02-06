package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11PromptAlert {
	public static void main(String[] args) throws InterruptedException
	{
		String given_text="Hello Meenatchi How are you today";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("Meenatchi");
		a.accept();
		String current_Text=driver.findElement(By.id("demo1")).getText();
		if(given_text.contains(current_Text))
		{
			System.out.println("you have successfully entered into the data inside the page");
			System.out.println(current_Text);
			driver.close();
		}
		else
		{
			System.out.println("data is unsuccessfull");
			driver.close();
		}
}
}