
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		String mainwindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> totalwindows = driver.getWindowHandles();
		
		String title = "https://the-internet.herokuapp.com/windows/new";
		
		Iterator<String> it = totalwindows.iterator();
		
		while(it.hasNext())
			
		{
			String wind = it.next();
			driver.switchTo().window(wind);
			if(driver.getCurrentUrl().equals(title))
			{
				break;
			}
		}
		
		driver.switchTo().window(mainwindow);
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
	}

}
