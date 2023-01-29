import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopupexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("http://the-internet.herokuapp.com/basic_auth");
		
		// here we cannot inspect the authentication pop up
		//here we can directly give the username and password along with the url
		
		//driver.navigate().to("http://username:password@url");
		
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement getthetext = driver.findElement(By.tagName("p"));
		String text = getthetext.getText();
		System.out.println(text);
	}

}
