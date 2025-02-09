package Package12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		//FullPage Screenshot
//		
//		TakesScreenshot ts= (TakesScreenshot)driver;  //type casting
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\screenshots\\homepage.png");
//		FileUtils.copyFile(src,trg);
		
//		//screenshot of section
//		
//		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File src=section.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\screenshots\\featureproduct.png");
//		FileUtils.copyFile(src,trg);
		
		//screenshot of webelement
		
		WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\logo.png");
		FileUtils.copyFile(src,trg);
		
		
	}

}
