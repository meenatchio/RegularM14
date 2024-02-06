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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testng1.BaseClass;

public class DataProviderWithExcel extends BaseClass {   //extends baseclass is not wrking
	@DataProvider(name= "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException
	{
	Object[][] obj=new Object[2][2]; //two dimension array
	File file=new File("D:\\loginFile.xlsx");
	FileInputStream fis=new FileInputStream(file); //connect the excel file to eclipse
	Workbook wbf = WorkbookFactory.create(fis); //workbookfactory include the apachepoi file
	Sheet sheet = wbf.getSheet("Sheet1"); //Sheet1 means excelfile name
	/*obj[0][0]=sheet.getRow(0).getCell(0).toString();
	obj[0][1]=sheet.getRow(0).getCell(1).toString();
	obj[1][0]=sheet.getRow(1).getCell(0).toString();
	obj[1][1]=sheet.getRow(1).getCell(1).toString();*/
	           //(or)
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
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

