package Package4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
//		//select single option
//		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all options and size
		List <WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));;
		System.out.println("Number of Options.." + options.size());
		
		//print options from dropdown
//		for(WebElement op:options)
//		{
//			System.out.println(op.getText());
//		}
		
		//select multiple options from dropDown
		for(WebElement op:options)
		{
			if(op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("C#"))
			{
				op.click();
			}
			
		}
	}

}
