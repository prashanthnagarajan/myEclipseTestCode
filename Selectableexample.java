import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class Selectableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		// Click on the selectable option
		WebElement clickonselectableicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[15]/a/img"));
		clickonselectableicon.click();
		
		
		List<WebElement> selectable =  driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int totallist = selectable.size();
		System.out.println(totallist);
		
		
		
		//With the help ctrl button and mouse select multiple
		
		Actions multipleselectable = new Actions (driver);
		
		multipleselectable.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(2))
		.click(selectable.get(4)).build().perform();
		
		
		
		
		//Another method to perform select able 
		
		//Actions multipleselectable = new Actions (driver);
		//multipleselectable.clickAndHold(selectable.get(0));
		//multipleselectable.clickAndHold(selectable.get(3));
		//multipleselectable.clickAndHold(selectable.get(4)).build().perform();
		
		//but when i do this since the hold is not released in between options are also getting selected 
		//use the first method itself
		
	}
	
	

}
