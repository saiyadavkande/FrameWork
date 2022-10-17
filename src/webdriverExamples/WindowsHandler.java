package webdriverExamples;





import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsHandler {

public static void main(String args[]) throws Exception{
    //Test Steps

System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//1st wind
driver.get("file:///C:/Users/saiya/Downloads/multiplewindows.html");
Thread.sleep(3000);
//2nd wind
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
//3rd wind
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);
ArrayList<String> windoinfo = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windoinfo.get(2));
Thread.sleep(3000);
System.out.println("ok");
//driver.close();
driver.quit();
}
}

