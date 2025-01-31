package Package5;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		//select specific check box
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all the check boxes
		List <WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
//		System.out.println("Total no. of checkboxes.."+checkboxes.size());
//		
//		for(WebElement checkbox:checkboxes)
//		{
//			checkbox.click();
//		}
		
		//Select multiple check boxes by choice--Monday and Sunday
		
//		for(WebElement checkbox:checkboxes)
//			{
//				String checkboxname=checkbox.getAttribute("id");
//				if(checkboxname.equals("sunday") || checkboxname.equals("saturday"))
//				{
//					checkbox.click();
//				}
//			}
		//select last 3 check boxes
		
		int totalnoofcheckbox=checkboxes.size();
//		for(int i=totalnoofcheckbox-3; i<totalnoofcheckbox; i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//select first 3 check boxes
		
		for(int i=0; i<totalnoofcheckbox; i++)
		{
			if(i<3)
			{
			checkboxes.get(i).click();
			}
		}
		
		
	}

}
