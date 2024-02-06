package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21AssignmentShopperStack 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://www.shoppersstack.com/";
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("You are in shoppersstack url");
			Thread.sleep(5000);
		    WebElement shopper_login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			Thread.sleep(2000);
			if(shopper_login.isEnabled())
			{
				System.out.println("You are in successfull login");
				shopper_login.click();
				Thread.sleep(5000);
				WebElement shopper_account = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
				Thread.sleep(5000);
				if(shopper_account.isDisplayed())
				{
					System.out.println("You are in verify create account page");
					Thread.sleep(5000);
					shopper_account.click();
					String given_title="ShoppersStack | Shopper | Signup";
					String current_title=driver.getTitle();
					if(given_title.contains(current_title))
					{
						System.out.println("You are in title is same");
						driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Meenatchi");
						driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Olaganathan");
						driver.findElement(By.xpath("//input[@value='FEMALE']")).click();
						driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("6381141091");
						driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("omeenatchi2001@gmail.com");
						driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Meena@2001");
						driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("Meena@2001");
						driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
						WebElement shopper_register = driver.findElement(By.xpath("//button[@id='Register']"));
						Thread.sleep(5000);
						if(shopper_register.isEnabled())
						{
							System.out.println("You are in register page");
							Thread.sleep(5000);
							shopper_register.click();
						}
						else
						{
							System.out.println("You are in not register page");
						}
					}
					else
					{
						System.out.println("You are in title is not same");
					}
				}
				else
				{
					System.out.println("You are in not verify create account page");
				}
			}
			else
			{
				System.out.println("You are in not successfull login");
			}
		}
		else
		{
			System.out.println("You are not in shoppersstack url");
		}
		
	}

}
