package hello;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_all {


	public static void main(String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		// Maximize the browser
		driver.manage().window().maximize();
	
		// Launch Website
		driver.get("https://demoqa.com/alerts");
		
		// clicking on prompt button
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
		
		// accepting javascript alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// clicking on prompt button
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
		
		// Rejecting javascript alert
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();		
		
	}

}
