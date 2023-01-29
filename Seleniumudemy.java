import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumudemy {

	public static void main(String[] args) {
		// open the web browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome driver\\\\Selenium chrom driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://www.google.com");
		
		WebElement Entertext = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Entertext.sendKeys("Chennai");
		 
		
		//Navigate to the webapplication  

	}

}
