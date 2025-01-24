package Package2;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_FindElementVsFindElements {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//findElement
		//1
//		WebElement searchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));  //single element
//		searchBox.sendKeys("xyz");
//		
//		//2
//		WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));  //multiple elements
//		System.out.println(ele.getText());   //print first element only
//		
		//3
		//WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit1']")); //throws .NoSuchElementException: if element not present on webpage
	
	//findElements
		//1
//		List <WebElement> links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));  //access all elements
//		System.out.println(links.size());
//		
//		for(WebElement ele:links)
//		{
//			System.out.println(ele.getText());
//		}
//		
//		//2
//		List <WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']")); //return single ele bcoz locator having one element
//		System.out.println(logo.size());
		
		//3
		List <WebElement> element=driver.findElements(By.xpath("//button[@type='submit1']"));  //does not throw .NoSuchElementException, return 0 instead
		System.out.println(element.size());
	}

}
