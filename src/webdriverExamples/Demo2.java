package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.openqa.selenium.By;

public class Demo2 
{




public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application opened");
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	{
		System.out.println("Title matched");
	}
	else
	
	{
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	 driver.findElement(By.name("Submit")).click();
	 System.out.println("Login completed");
	 Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title not matched");
			System.out.println("driver.getTitle()");
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
}
}
		

	


