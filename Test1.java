import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	  
  //1.Open Chrome
  //2.open Google
  //3.Search anything

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrom driver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//driver.get("http://www.leafground.com/pages/Link.html");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		
	//enter a search
    //click on wikipeadia link
		
		driver.findElement(By.name("q")).sendKeys("Chennai");
		
		driver.findElement(By.name("btnK")).click();
		
		//List<WebElement> tags= driver.findElements(By.tagName("a"));
		
		
		driver.close();
		
	}

}
