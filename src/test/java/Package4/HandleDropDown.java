package Package4;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		
		WebElement dropcountryEle = driver.findElement(By.id("country"));
		
		Select dropcountry = new Select(dropcountryEle);
		
		//dropcountry.selectByVisibleText("Canada");
		
		//dropcountry.selectByValue("india");
		
		//dropcountry.selectByIndex(3);
		

		//selecting option from dropdown without using above methods
		
		List <WebElement> alloptions=dropcountry.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Canada"))
			{
				option.click();
				break;
			}
		}
	}

}
