package Package7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIFrame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement outerframe=driver.findElement(By.xpath("//*[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe=driver.findElement(By.xpath("//div[@class='iframe-container']//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		
	}

}
