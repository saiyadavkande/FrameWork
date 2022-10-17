package webdriverExamples;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class Mousecusser 
{
	

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
		if(driver.getTitle().equals("HRm"))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title not matched");
			System.out.println("driver.getTitle()");
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Login completed");
		 Thread.sleep(3000);
		 
	if(driver.getTitle().equals("HRM"))
	{
		System.out.println("Title matched");
	}
	else
	{
		System.out.println("Title not matched");
		System.out.println("driver.getTitle()");
	}
	Actions ac=new Actions(driver);
	
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("Mouseover completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("clicked on Addemp sub menu");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();
	}
}
		 
	
		 
	

		 
	
    
	
		 
		 
		 
	
		 
	

    

	
	
		 
	
	


