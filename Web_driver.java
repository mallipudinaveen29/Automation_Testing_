package Naveen;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.time.Duration;

public class welcomeSel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\exam2\\Desktop\\browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String resource = driver.getPageSource();
		//System.out.println(resource);
		if(resource.contains("google"))
		{
			System.out.println("Page Loaded");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.navigate().to("https://w3schools.com");
		
		driver.navigate().back();
		
		driver.manage().window().maximize(); 
		driver.manage().window().minimize(); 
		
		System.out.println(driver.getCurrentUrl());
	}
	
	

}
