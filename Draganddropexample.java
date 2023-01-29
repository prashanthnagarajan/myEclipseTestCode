import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		WebElement clickondraganddropicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[13]/a/img"));
		clickondraganddropicon.click();
		
		
		WebElement dragfrom = driver.findElement(By.id("draggable"));
		WebElement dropto = driver.findElement(By.id("mydiv"));
		// to do the mouse action you need a class called actions that is action class
		
		//1. Drag and drop the box
	
		Actions mouseaction = new Actions(driver);
		
		//if we want to drag and drop in boxes use 
		//mouseaction.clickAndHold(dragfrom).moveToElement(dropto).release().build().perform();
		
		//if we want to drag and drop with respect to location the use this statement
		//mouseaction.clickAndHold(dragfrom).dragAndDropBy(dropto, 240, 150).release().build().perform();
		
		//another method to drag and drop
		mouseaction.dragAndDrop(dragfrom, dropto).build().perform();
		
		
		
		
		
		//driver.close();

	}

}
