package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day25Indepent_Dependent {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();//open the browser
	    driver.manage().window().maximize();//maximize the browser
	    driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
	    Thread.sleep(2000);
	    WebElement web=driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div/child::span"));//one method
	    System.out.println(web.getText());
	    WebElement album=driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));//2nd method
	    System.out.println(album.getText());
	    WebElement music=driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/parent::h2/parent::div/child::div[3]/child::div/child::span"));
	    System.out.println(music.getText());
	    WebElement musics=driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../following-sibling::div[3]/div/span"));//3rd method
	    System.out.println(musics.getText());
}
}