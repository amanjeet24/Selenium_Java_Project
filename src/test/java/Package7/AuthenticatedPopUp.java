package Package7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Syntax
		//http://user:password@URL
	}

}
