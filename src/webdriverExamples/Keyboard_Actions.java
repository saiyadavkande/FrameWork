package webdriverExamples;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



import java.awt.Robot;
import java.awt.event.KeyEvent;
public class Keyboard_Actions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		//click:keyboard:1.TAB 2.ENTER
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("ENTER");
		System.out.println("Lgin completed");
		Thread.sleep(3000);
		
		
		
		
		
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		
		driver.close();
		
		

	}
}
