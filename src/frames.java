import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_comment_out");
        driver.manage().window().maximize();
        //By using name locator
        driver.switchTo().frame("iframeResult");
        //By using ID locator
        //driver.switchTo().frame("iframeResult");
        //By using WebElement
      //WebElement del = driver.findElement(By.xpath("//iframe[@ id = 'iframeResult']"));
      // driver.switchTo().frame(del);
        //By using index
        
       // driver.switchTo().frame(1);
        
        String te =driver.findElement(By.xpath("//p[text() = 'This is a paragraph.']")).getText();
        
        System.out.println(te);
		
	}

}
