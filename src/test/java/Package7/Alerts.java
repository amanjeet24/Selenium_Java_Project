package Package7;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertWin=driver.switchTo().alert();
		System.out.println("Message displayed on alert.." + alertWin.getText());
		alertWin.sendKeys("Welcome");
		alertWin.accept();
	}

}
