package webdriverExamples;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class Assignment_Links {

		public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement val:links) {
		
			System.out.println(val.getText());
			Thread.sleep(3000);
			driver.close();
		}
		}
}
		
			
		



