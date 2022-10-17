package webdriverExamples;


import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FileUpload {

	public static void main(String[] args)throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("firstname");
		
		WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		
		fileInput.sendKeys("C:\\Pic");
		System.out.println("ok");
		//fileInput.sendKeys("G:\\06.TestingTools\\1.0.ProjectName\\Templates\\Defect Template.xlsx");
		        Thread.sleep(7000);
		        System.out.println("File uploaded successfully");        
		        driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		        Thread.sleep(7000);
		          System.out.println("New Employee Added");
		          driver.switchTo().defaultContent();
		          driver.findElement(By.linkText("Logout")).click();
		          driver.close();
		
		
	}

}
