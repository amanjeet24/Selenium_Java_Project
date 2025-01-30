package Package4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown_BingSearch {

	public static void main(String[] args) throws InterruptedException{
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List <WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg  sa_blue_hv   ']//span"));
		System.out.println("Size of Auto-suggestions...." + list.size());
		
		for(WebElement listItem:list)
		{
			//System.out.println(listItem.getText());
			if(listItem.getText().contains("benefits"))
			{
				listItem.click();
				break;
			}
		}
	}

}
