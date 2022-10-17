package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com//droppable//&quot;");
	//verify tittle:con fail-stop exe
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	driver.switchTo().frame(0);
	Actions ac=new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	System.out.println("drag&drop");
	driver.close();
	
	
	}


		
	}


