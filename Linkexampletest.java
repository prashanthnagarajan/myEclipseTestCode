import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkexampletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrom driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		//driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	
		//driver.findElement(By.linkText("Verify am I broken?")).click();
		
		//driver.findElement(null)
	
		driver.close();
	}
 
}
