package Package11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsMultipleKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		
		input1.sendKeys("Welcome to Selenium");
		
		Actions act =new Actions(driver);
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//Ctrl+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//tab key to move to next input2 box
		act.sendKeys(Keys.TAB);
		
		//Ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//compare text
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		System.out.println("Text copied");
		else
			System.out.println("Not copied");
		
	}

}
