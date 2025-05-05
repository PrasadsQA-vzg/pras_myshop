import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Traversaltechniques {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement swig = driver.findElement(By.linkText("Sign in"));
		swig.click();
		WebElement swig1 = driver.findElement(By.id("mobile"));
		swig1.sendKeys("9666109604");
		
		WebElement tra5 = driver.findElement(By.xpath("input[@id = 'mobile']/parent::div/parent::div/following-sibling::div[1]/a"));
		tra5.submit();
		
		////input[@id = 'mobile']/parent::div/parent::div/following-sibling::div[1]/a

	}

}
