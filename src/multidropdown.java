import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class multidropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        WebElement v = driver.findElement(By.id("multiselect1"));
        
        Select select = new Select(v);
        select.selectByValue("volvox");
      
        select.selectByValue("audix");
        
       List<WebElement> list = select.getAllSelectedOptions();
       
        for(WebElement drop : list) {
        	
        	System.out.println(drop.getText());
        }
        
        select.deselectByValue("volvox");
        
       List<WebElement> all = select.getOptions();
         for(WebElement all1 : all) {
        	 System.out.println(all1.getText());
         }
      
        
	}

}
