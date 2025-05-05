import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://demoqa.com/automation-practice-form");
		
		 File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File defile = new File("./screenshot1.auto1.png");
		 
		 FileHandler.copy(srcfile, defile);
		 Thread.sleep(2000);

	}

}
