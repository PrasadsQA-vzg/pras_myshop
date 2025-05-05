import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	    
	    WebElement log = driver.findElement(By.id("email"));
	    log.sendKeys("naga34@test.com");
	    
	    WebElement log1 = driver.findElement(By.id("passwd"));
	    log1.sendKeys("Saisomwya@96");

	    WebElement log2 = driver.findElement(By.xpath("//i[@ class = 'icon-lock left']"));
	    log2.click();
	}

}
