import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//css selectors
		//id -- input#userName
		//class --- 
		//attribute	---
		//substring  -- 
		//1.starts with -- ^
		//2.ends-with --$
		//3.contains --*
		//innerstring -- 
		
		WebElement area = driver.findElement(By.cssSelector("input#userName"));
		area.sendKeys("prasad");
		
		
	    WebElement test = driver.findElement(By.cssSelector("input.form-control[placeholder ='name@example.com']"));
	    test.sendKeys("prasadmarni66@gmail.com");
	    
	    WebElement test1 = driver.findElement(By.cssSelector("textarea[placeholder = 'Current Address']"));
	    test1.sendKeys("KKD");
	    
	    
	    WebElement sel = driver.findElement(By.cssSelector("textarea[placeholder^='Curr']"));
	    sel.sendKeys("vzg");
	    
	    WebElement sel1 = driver.findElement(By.cssSelector("textarea[placeholder$='ess']"));
	    sel1.sendKeys("jpt");
	    
	    WebElement sel2 = driver.findElement(By.cssSelector("textarea[placeholder*='ess']"));
	    sel2.sendKeys("KPT");
	    
	    
	    
	    
	    
	}
	
	

}
