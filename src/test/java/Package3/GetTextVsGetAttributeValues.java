package Package3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttributeValues {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement emailInputBox=driver.findElement(By.id("Email"));
		
//		emailInputBox.clear();
//		emailInputBox.sendKeys("adm123@gmail.com");
		
		//capturing text from input textBox
		
		System.out.println("Result from getAttribute..." + emailInputBox.getAttribute("value"));
		System.out.println("Result from getText..." + emailInputBox.getText());  //returns nothing, because input tag has no inner text
		
		//Login Button
		
		WebElement login=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getAttribute("class"));
		
		System.out.println(login.getText());
		
		//capturing value of inner text using getText() method
		String title= driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		System.out.println(title);
		
	}

}
