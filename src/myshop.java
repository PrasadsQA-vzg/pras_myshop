import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class myshop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Prasad");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("marni");
		WebElement email = driver.findElement(By.xpath("//input[@ placeholder = 'name@example.com']"));
		email.sendKeys("prasadmarni666@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@ for = 'gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9666109604");
		driver.findElement(By.id("subjectsInput")).sendKeys("KKD");
		Thread.sleep(3000);
		driver.findElement(By.id("hobbies-checkbox-1")).click();
        
        
        		
}
		
}
