import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://demoqa.com/radio-button");

            // YES Button
            WebElement yesButton = driver.findElement(By.xpath("//label[@for ='yesRadio']"));
            yesButton.click();
            System.out.println("Clicked YES button");

            WebElement yesButtonSelected = driver.findElement(By.id("yesRadio"));
            if (yesButtonSelected.isSelected()) {
                System.out.println("'Yes' radio button selected");
            } else {
                System.out.println("'Yes' radio button not selected");
            }

            // Impressive Button
            WebElement impressiveButton = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
            impressiveButton.click();
            System.out.println("Clicked Impressive button");

            WebElement impressiveSelected = driver.findElement(By.id("impressiveRadio"));
            if (impressiveSelected.isSelected()) {
                System.out.println("'Impressive' radio button selected");
            } else {
                System.out.println("'Impressive' radio button not selected");
            }

            // No Button (disabled)
            WebElement noRadioButton = driver.findElement(By.id("noRadio"));
            if (!noRadioButton.isEnabled()) {
                System.out.println("'No' radio button is disabled as expected");
            } else {
                System.out.println("'No' radio button is enabled (unexpected)");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
