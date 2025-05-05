import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class opennewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement newtab = driver.findElement(By.linkText("jqueryui"));
		 @Nullable
		String link = newtab.getAttribute("href");
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get(link);
		
		//newtab.sendKeys(Keys.CONTROL , Keys.RETURN);

	}

}
