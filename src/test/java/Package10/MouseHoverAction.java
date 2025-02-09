package Package10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");  //verify error
		
		WebElement compMenu=driver.findElement(By.xpath("//a[text()='Computers ']"));
		WebElement notebookMenu=driver.findElement(By.xpath("//a[text()='Notebooks ']"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(compMenu).moveToElement(notebookMenu).click().perform();
		
	}

}
