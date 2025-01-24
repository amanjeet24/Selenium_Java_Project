package Package2;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Navigations {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca");
	//	driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		

	}

}
