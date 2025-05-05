import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alreathandling {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*driver.findElement(By.xpath("//button[@ onclick = 'jsAlert()']")).click();
		Alert al = driver.switchTo().alert();
		String jsalert = al.getText();
		System.out.println(jsalert);
		Thread.sleep(3000);
		al.accept();
		driver.quit();*/
		
		/*driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']")).click();
		Alert al1 = driver.switchTo().alert();
		String jsconfrom = al1.getText();
		System.out.println(jsconfrom);
		Thread.sleep(3000);
		//al1.accept();
		al1.dismiss();
		driver.quit();*/
		
		WebElement promt = driver.findElement(By.xpath("//button[text() ='Click for JS Prompt']"));
		promt.click();
		Alert al2 = driver.switchTo().alert();
		String jspromt = al2.getText();
		System.out.println(jspromt);
		Thread.sleep(2000);
        al2.sendKeys("Prasad");
		Thread.sleep(3000);
		al2.accept();
		Thread.sleep(3000);
		driver.quit();

		
	}

}
