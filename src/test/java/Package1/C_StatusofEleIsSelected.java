package Package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_StatusofEleIsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		
		//isSelected
		WebElement male= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //false
		
		male.click();
			
		System.out.println(male.isSelected()); //true
		System.out.println(female.isSelected()); //false
		
		female.click();
		
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //true
		
		driver.quit();	}

	}


