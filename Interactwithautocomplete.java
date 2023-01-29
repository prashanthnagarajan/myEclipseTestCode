

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interactwithautocomplete {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome driver\\Selenium chrome driver ver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		WebElement clickoninteractwithautocompleteicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[17]/a/img"));
		clickoninteractwithautocompleteicon.click();
		
		WebElement sendtheletter = driver.findElement(By.id("tags"));
		sendtheletter.sendKeys("c");
		
		
		Thread.sleep(30000);
		
		
		
		
		
		
		List <WebElement> getthelistofunordered = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		for (WebElement webElement : getthelistofunordered) {
			
			if(webElement.getText().contains("Cucumber"));{
				webElement.click();
				break;
				
			}
			
			
			
			
		}		
	
		
		
	}
}




//I am getting this error here i am moving forward from this

