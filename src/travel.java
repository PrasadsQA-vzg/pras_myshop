import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class travel {

	public static void main(String[] args) throws InterruptedException {
		
		//Xpath

		//XML Path language

		//Absolute xpath ---starts from root node of dom--/

		///html/body/form/table/tbody/tr[1]
		
		//Relative xpath ---  //
		////attribute ---//input[@id='userEmail']
		//And /or---//textarea[@class ='form-control' and @placeholder='Current Address']
		//contains--//textarea[contains(@id,'currentAddress')]
		//text--//a[text()='Home']
		//starts-with---//textarea[starts-with(@id,'curr')]
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement tra = driver.findElement(By.xpath("//input[@id='userName']"));
		tra.sendKeys("Bhanu");
		
		WebElement tra1 = driver.findElement(By.xpath("//textarea[@class ='form-control' and @placeholder='Current Address']"));
		tra1.sendKeys("KKD, cinema road");
		
		WebElement tra2 = driver.findElement(By.xpath("//textarea[contains(@id,'permanentAddress')]"));
		tra2.sendKeys("vzg, akkaya");
		
		WebElement tra4 = driver.findElement(By.xpath("//textarea[starts-with(@class,'form-control')]"));
		tra4.sendKeys("HYD");
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/links");
		WebElement tra3 = driver.findElement(By.xpath("//a[text()='No Content']"));	
		tra3.click();
		
	}

}
