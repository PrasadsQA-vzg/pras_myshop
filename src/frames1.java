import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		WebElement del2 = driver.findElement(By.xpath("//iframe[@ id ='mce_0_ifr']"));
		driver.switchTo().frame(del2);
		String del1 = driver.findElement(By.xpath("//p[text() ='Your content goes here.']")).getText();
        System.out.println(del1);
	}

}
