import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class traversalInsta {

	public static void main(String[] args) {
	
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebElement insta = driver.findElement(By.tagName("Phone number, username, or email"));
		
		insta.sendKeys("Pasadmarni666@gmail.com");
		
		WebElement insta1 = driver.findElement(By.xpath("//input[@aria-label = 'Password']"));
		insta1.sendKeys("Prasad@666");
	
		WebElement insta2 = driver.findElement(By.xpath("//input[@aria-label = 'Password']/ancestor::label/parent::div/parent::div/following-sibling::div/child::button"));
        
		insta2.click();
		
	}

}
