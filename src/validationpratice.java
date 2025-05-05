import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validationpratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		 WebElement email= driver.findElement(By.id("email_create"));
		 email.sendKeys("prasadmarni14@gmail.com");
		 driver.findElement(By.id("SubmitCreate")).click();
		 Thread.sleep(3000);
	
		String email2 = driver.findElement(By.id("email")).getAttribute("value");
		if(email2.equalsIgnoreCase("PRASADMARNI14@GMAIL.COM")) {
			System.out.println("Email: " + email2);
		}
		
		else {
			System.out.println("Invalid mail id");
		}
		 
		 
	}

}
