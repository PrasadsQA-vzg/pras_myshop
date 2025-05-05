import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowhandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		//driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		String windowhandle = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		String title ="https://www.w3schools.com/";
		Iterator<String> it = allwindows.iterator();
		
		while(it.hasNext()) 
		{
			String wind = it.next();
			driver.switchTo().window(wind);
			if(driver.getTitle().equals(title))
			{
				break;
			}
		}
		driver.findElement(By.linkText("JAVA")).click();
		
		//driver.switchTo().window(mainwindows);
		
		//System.out.println(driver.getTitle());

	}

}
