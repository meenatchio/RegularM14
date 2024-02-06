package DataProviderWithExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testng1.BaseClass;

public class DynamicRowCell extends BaseClass{ //baseclass cannot wrk
	@DataProvider(name= "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException
	{
	File file=new File("D:\\loginFile.xlsx");
	FileInputStream fis=new FileInputStream(file); //connect the excel file to eclipse
	Workbook wbf = WorkbookFactory.create(fis); //workbookfactory include the apachepoi file
	Sheet sheet = wbf.getSheet("Sheet1"); //Sheet1 means excelfile name
	int row = sheet.getPhysicalNumberOfRows();  //dynamic model give rows and coloms from user
	int colom = sheet.getRow(0).getPhysicalNumberOfCells();
	//System.out.println(row);
	//System.out.println(colom);
	Object[][] obj=new Object[row][colom]; //two dimension array
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<colom;j++)
	      {
			obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
	return obj;
	}
	@Test(dataProvider= "login")
	public void receiver(String email,String password) //receive data and open 2 times 
	{
	        WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/login");
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			//System.out.println(email);
			//System.out.println(password);
			
		}
}
