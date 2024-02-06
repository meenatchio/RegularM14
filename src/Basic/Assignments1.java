package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments1 {
	public static void main(String[] meena) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.get("https://demowebshop.tricentis.com");//enter into the particular webpage
        driver.navigate().to("https://www.abhibus.com/");//enter into the particular webpage using navigate
        driver.navigate().back();//back to the demowebshop page
        String given_title="Demo Web Shop";//store title in string container
        System.out.println(driver.getTitle());//fetch that url
        String current_title=driver.getTitle();//store url in another string container
        if(given_title.equals(current_title))//check if the url is same or not
        {
	    	System.out.println(" the given and current title is same");
	    }
	    else
	    {
	    	System.out.println(" the given and current title is not same");
	    }
        Thread.sleep(2000);//wait for 2sec
        driver.findElement(By.id("small-searchterms")).sendKeys("Books");//enter the data into the textfield
        Thread.sleep(2000);//wait for 2sec
        driver.navigate().refresh();//refresh the particular webpage
        Thread.sleep(2000);//wait for 2sec
        driver.navigate().forward();//again forward to the abhibus webpage
        Thread.sleep(2000);//wait for 2sec
        driver.close();//close the webpage
	}
}
