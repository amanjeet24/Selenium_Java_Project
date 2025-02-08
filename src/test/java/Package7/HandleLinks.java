package Package7;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://students.dpcdsb.org/");
		
		//driver.findElement(By.linkText("myBlueprint")).click();
		
		driver.findElement(By.partialLinkText("Blue")).click();
		
		//how to capture all the links on the page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("Number of links..." +links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
	}

}
