import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;   


public class Randomtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1. Open  the browser
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 100\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		driver.navigate().to("http://www.leafground.com/home.html");
	
	}

}
