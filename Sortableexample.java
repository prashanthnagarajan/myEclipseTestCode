
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sortableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 95\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/home.html");
		
		
		
		
		WebElement clickonsortableicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[16]/a/img"));
		clickonsortableicon.click();
		
		//Comparator<? super WebElement> sortinggthelist = (Comparator<? super WebElement>) driver.findElement(By.xpath("//*[@id=\"sortable\"]/li"));
		List<WebElement> listofsortable =  driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		int totalnumberofsortable = listofsortable.size();
		
		System.out.println(totalnumberofsortable);
		
		
	}

}
