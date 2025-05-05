import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class myshop1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		  WebElement email= driver.findElement(By.id("email_create"));
		 email.sendKeys("prasadmarni15@gmail.com");
		 driver.findElement(By.id("SubmitCreate")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("uniform-id_gender1")).click();
		 WebElement name = driver.findElement(By.id("customer_firstname"));
		 name.sendKeys("Prasad");
		 driver.findElement(By.id("customer_lastname")).sendKeys("Marni");
		 driver.findElement(By.xpath("//input[@ name ='passwd']")).sendKeys("prasadmarni");
		 WebElement dd = driver.findElement(By.id("days"));
		 
		 Select select = new Select(dd);
		 select.selectByValue("1");
         WebElement dd1 = driver.findElement(By.id("months"));
         Select select1 = new Select(dd1);
         select1.selectByValue("5");
         WebElement dd2 = driver.findElement(By.id("years"));
         Select select2 = new Select(dd2);
         select2.selectByValue("2024");
         driver.findElement(By.xpath("//input[@ name = 'newsletter']")).click();
         driver.findElement(By.id("submitAccount")).click();
         WebElement text = driver.findElement(By.className("alert-success"));
         String a = text.getText();
         System.out.println(a);
         
	}

}
