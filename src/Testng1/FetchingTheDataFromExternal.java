package Testng1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;public class FetchingTheDataFromExternal {
@Test
public void loginDws() throws EncryptedDocumentException, IOException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	File file=new File("D:\\loginFile.xlsx");
	FileInputStream fis=new FileInputStream(file); //connect the excel file to eclipse
	Workbook wbf = WorkbookFactory.create(fis); //workbookfactory include the apachepoi file
	Sheet sheet = wbf.getSheet("Sheet1"); //Sheet1 means excelfile name
	String email = sheet.getRow(0).getCell(0).toString(); //fetch first row and first column
	String password = sheet.getRow(0).getCell(1).toString(); //fetch first row second column
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
}
}
