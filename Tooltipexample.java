import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Tooltipexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 95\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		
		//1. Get the tool tip text shown
		
		//Clickon the tooltip icon
		WebElement clcikonthetooltipicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[20]/a/img"));
		clcikonthetooltipicon.click();
		
		//go to the textbox to get the tool tip text
		WebElement clickonthetextbox = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		//it will be saved in the attribute so now get that attribute and print
		String textshownwhenhovered = clickonthetextbox.getAttribute("title");
		System.out.println(textshownwhenhovered);
		
		//another method to find it by moving the mouse to the box
		//Actions movingmouseaction =  new Actions(driver);
		//movingmouseaction.moveToElement(clickonthetextbox).click().build().perform();
		
		
		
		
	}

}
