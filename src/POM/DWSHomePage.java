package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {
	DWSHomePage(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this); //this means store address and pagefactory means store container and connect our pom ;
	}
	@FindBy(id="small-searchterms")
	WebElement searchField;   //webelement mean type and searchfield means name of the container
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchButton;
	//or
	public void searchField(String value) //methods
	{
		searchField.sendKeys(value);
	}
	public void searchButton()
	{
		searchButton.click();
	}
}
