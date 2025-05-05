import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	@SuppressWarnings({ "deprecation", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	//ID
		WebElement a = driver.findElement(By.id("userName"));
		a.sendKeys("Prasad");
		
	//class - doubt
		//WebElement b = driver.findElement(By.className("mmr-sm-2 form-control"));
		//b.sendKeys("prasadmarni66@gmail.com");
    //name- doubt
		//WebElement c = driver.findElement(By.name("userEmail"));
		//c.sendKeys("Prasadmarni@gmail.com");
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		
		 for (WebElement element : list)	
		 {
			System.out.println(element.getAttribute("placeholder"));
		 }
		 
		// WebElement link = driver.findElement(By.linkText("Gmail"));
		// link.click();
			 
		//WebElement link1 = driver.findElement(By.partialLinkText("Gm"));
		//link1.click();
		
		
		
	}

}
