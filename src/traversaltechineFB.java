import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class traversaltechineFB {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		
		WebElement fb = driver.findElement(By.id("email"));
		fb.sendKeys("Prasadmarni66@gmil.com");
		
		WebElement fb2 = driver.findElement(By.id("pass"));
		fb2.sendKeys("9666109604");
	
		
		WebElement fb1 = driver.findElement(By.xpath("//input[@id = 'email']//parent::div/following-sibling::div[2]/button"));
		fb1.click();

	}

}
