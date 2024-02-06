package Listenners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listenners.StartListeners.class)
public class Skipped {
@Test(timeOut= 1000)
public void m1() throws InterruptedException   //testmethod class la assert.fail() is there so skipped
{
	Thread.sleep(3000);
	System.out.println("executing m1");
}
@Test(dependsOnMethods= "m1")
public void m2()   //m2 is depend on m1 so m1 is skipped so m2 is not executed
{
	System.out.println("executing m1");
}
}
