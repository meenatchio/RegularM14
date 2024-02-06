package Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day29Assignment {
	
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();//open the browser
		    driver.manage().window().maximize();//maximize the browser
		    Thread.sleep(2000);
		    driver.get("https://demowebshop.tricentis.com/");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		    WebElement single_listbox = driver.findElement(By.cssSelector("select[id=\"products-orderby\"]"));
		    Thread.sleep(2000);
		    Select s_ref=new Select(single_listbox);
		    Thread.sleep(2000);
		    /*s_ref.selectByVisibleText("Position");
		    Thread.sleep(2000);
		    s_ref.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		    Thread.sleep(2000);
		    s_ref.selectByVisibleText("Name: Z to A");
		    Thread.sleep(2000);
		    s_ref.selectByVisibleText("Price: Low to High");
		    Thread.sleep(2000);
		    s_ref.selectByValue("https://demowebshop.tricentis.com/books?orderby=11");
		    Thread.sleep(2000);
		    s_ref.selectByIndex(5);*/
		    List<WebElement> web = s_ref.getOptions();  //staleElementException
		    int i=0;
		    for(WebElement a:web)
		    {
		    	single_listbox = driver.findElement(By.cssSelector("select[id=\"products-orderby\"]"));
		    	s_ref=new Select(single_listbox);
			    Thread.sleep(2000);
			    s_ref.selectByIndex(i++);
			    Thread.sleep(1000);
		    }
		    
}
}
