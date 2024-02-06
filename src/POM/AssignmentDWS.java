package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentDWS {
	AssignmentDWS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(className="ico-register")
	WebElement Register;
	@FindBy(className="ico-login")
	WebElement Login;
	@FindBy(partialLinkText="Shopping")
	WebElement ShoppingCart;
	@FindBy(partialLinkText="Wishlist")
	WebElement Wishlist;
	
	
}
