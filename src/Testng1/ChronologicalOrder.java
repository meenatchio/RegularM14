package Testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
@BeforeSuite
public void beforesuite()  //database
{
	System.out.println("before suite");
}
@BeforeTest
public void beforetest()  //database
{
	System.out.println("before test");
}
@BeforeClass
public void beforeclass()  //open the browser
{
	System.out.println("before class");
}
@BeforeMethod
public void beforemethod()   //login
{
	System.out.println("before method");
}
@Test
public void test() 
{
	System.out.println("hi hello iam from testcase");
}
@Test
public void test123()
{
	System.out.println("hi hello iam from testcase123");
}
@AfterMethod
public void aftermethod()    //logout
{
	System.out.println("after method");
}
@AfterClass
public void afterclass()  //close the browser
{
	System.out.println("after class");
}
@AfterTest
public void aftertest()  //disconnect database
{
	System.out.println("after test");
}
@AfterSuite
public void aftersuite()  //disconnect database
{
	System.out.println("after suite");
}
}
