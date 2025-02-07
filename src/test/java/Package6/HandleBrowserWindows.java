package Package6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getWindwoHandle()
//		
//		String winId = driver.getWindowHandle();
//		System.out.println(winId);
//		
		//getWIndowHandles
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> winIDs= driver.getWindowHandles();
		
		//first method--iterator
		
//		Iterator <String> it=winIDs.iterator();
//		String parentWinId=it.next();
//		String childWinId=it.next();
//		
//		System.out.println("Parent Win..." + parentWinId);
//		System.out.println("Child Win..." + childWinId);
		
		//secondMethod--- List/ArrayList
		
		List<String> winsId= new ArrayList(winIDs);   //converting set to List   //List is interface and ArrayList is class
		
//		String parentWin=winsId.get(0);
//		String childWin=winsId.get(1);
//		
//		System.out.println("Parent Win..." + parentWin);
//		System.out.println("Child Win..." + childWin);
//		
//		//how to use window id for switching
//		
//		driver.switchTo().window(parentWin);
//		System.out.println("PARENT window title  "+ driver.getTitle());
//		
//		driver.switchTo().window(childWin);
//		System.out.println("Child window title  "+ driver.getTitle());
		
		
		//for each loop
		for(String wId:winsId)
		{
			String title=driver.switchTo().window(wId).getTitle();
			//System.out.println(title);
			
			if(title.equals("OrangeHRM")||title.equals("another title"))
			{
				driver.close();
			}
		}
		
//		driver.close();
//		driver.quit();
	}

}
