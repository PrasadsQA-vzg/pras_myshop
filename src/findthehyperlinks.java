import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findthehyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> hyper = driver.findElements(By.xpath("//a"));		
		
		for(WebElement link : hyper )
		{
			System.out.println(link.getDomAttribute("href"));
		}
		
		driver.quit();
	}

}
