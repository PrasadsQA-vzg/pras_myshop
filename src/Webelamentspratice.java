import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelamentspratice {

	public static void main(String[] args) {
		
	
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement web = driver.findElement(By.id("userName"));
		web.sendKeys("prasad");
		
		WebElement web1 = driver.findElement(By.id("userEmail"));
		web1.sendKeys("prasadmarni666@gmail.com");
		
		WebElement web2 = driver.findElement(By.id("currentAddress"));
		web2.sendKeys("VKP");
		
		WebElement web3 = driver.findElement(By.id("permanentAddress"));
		web3.sendKeys("RJY");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        
        System.out.println("Submit button clicked!");
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		

		
		finally 
		{

			driver.quit();
		}
		
		
		
	}

}
