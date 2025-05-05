import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizedrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		WebElement fram = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fram);
		Thread.sleep(3000);
		WebElement res = driver.findElement(By.xpath("//div[contains(@ class, 'ui-resizable-handle ui-resizable-se')]"));
		Actions dd = new Actions(driver);
		dd.dragAndDropBy(res, 100, 0).build().perform();
		driver.quit();
		

	}

}
