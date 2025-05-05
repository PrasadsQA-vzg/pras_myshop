import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mouse over option
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement blog = driver.findElement(By.id("blogsmenu"));
		act.moveToElement(blog).click().build().perform();
		
		WebElement sel = driver.findElement(By.xpath("//span[text() ='SeleniumOneByArun']"));
        sel.click();*/
		//drag and drop
		/*driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		WebElement rang = driver.findElement(By.xpath("(//a[@ class = 'ui-slider-handle ui-btn ui-shadow ui-btn-null'])[1]"));
        Actions act1 = new Actions(driver);
        act1.dragAndDropBy(rang, 150, 0).build().perform();*/
		
		//right click
		
		/*driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Actions act3 = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//input[@ value = 'Search']"));
        act3.contextClick(rightclick).build().perform();*/
		
		//Double click
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Actions act4 = new Actions(driver);
		WebElement duble = driver.findElement(By.xpath("//button[text() =' Double click Here   ']"));
		act4.doubleClick(duble).build().perform();
		Alert alt =driver.switchTo().alert();
		alt.accept();
		
		
	}

}
