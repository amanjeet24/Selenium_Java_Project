package Package1;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_StatusOfWebElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//isDisplayed() and isEnabled method
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status.."+ searchStore.isDisplayed());
		System.out.println("Enable Status.."+ searchStore.isEnabled());


		
		driver.quit();	}

}
