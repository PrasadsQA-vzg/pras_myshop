import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		
public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/search?q=apple+mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&as-pos=1&as-type=RECENT&suggestionId=apple+mobiles%7CMobiles&requestId=74513d15-9fcc-41ea-a7e0-16499e689ee3&as-backfill=on&otracker=nmenu_sub_Electronics_0_Apple");
				List<WebElement> apple = driver.findElements(By.xpath("//div[contains(text(),'Apple')][@class = 'KzDlHZ']"));
				
				
				List<WebElement> price = driver.findElements(By.xpath("//div[@class = 'Nx9bqj _4b5DiR']"));
				System.out.println("Apple Moblies:\n");
				
			    for(int i=0; i<apple.size(); i++){
			      for(int j=0;j<1;j++){
				     System.out.println((i+1)+ "." +apple.get(i).getText() + "- " +price.get(i).getText());

			      }
			    }
	
	

	}

}
