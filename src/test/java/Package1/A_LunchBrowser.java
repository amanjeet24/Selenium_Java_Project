package Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_LunchBrowser {

	public static void main(String[] args) {
		
		//Chrome Browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//Firefox Browser
//		WebDriver driver= new FirefoxDriver();
//		driver.get("https://www.google.com");
		
		//Edge Browser
//		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.google.com");
		
		//how to get title of the web page
		System.out.println(driver.getTitle());  
		
		//how to get current URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//how to get page source
		System.out.println(driver.getPageSource());
	}

}
