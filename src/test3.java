
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/radio-button");

        // Click "Yes" radio button
        WebElement yesLabel = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesLabel.click();
        checkSelection(driver, "Yes");

        // Click "Impressive" radio button
        WebElement impressiveLabel = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveLabel.click();
        checkSelection(driver, "Impressive");

        // Check if "No" radio button is enabled
        WebElement noRadio = driver.findElement(By.id("noRadio"));
        if (!noRadio.isEnabled()) {
            System.out.println("'No' radio button is disabled as expected");
        } else {
            System.out.println("'No' radio button is enabled (unexpected)");
        }

	}

	private static void checkSelection(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}


	}

