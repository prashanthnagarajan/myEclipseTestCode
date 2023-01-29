import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 100\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/home.html");
		
		
		Thread.sleep(3000);
		//Refresh when driver.navigate.to is used
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		WebElement clickondatesicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[12]/a/img"));
		clickondatesicon.click();
		
		WebElement dateselectortextbox = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		dateselectortextbox.click();
		
		//After clicking on the text box wait for few seconds for the date to get opened
		Thread.sleep(5000);
		
		//Now we can either, click on the date or we can use the sendkeys and hard code the date
		
		//Using send Keys
		dateselectortextbox.sendKeys("04/04/2022" + Keys.ENTER);
		
		Thread.sleep(3000);
		dateselectortextbox.clear();
		//Selecting directly
        dateselectortextbox.click();
		
		//After clicking on the text box wait for few seconds for the date to get opened
		Thread.sleep(5000);
		//dateselectortextbox.findElement(By.xpath("//*[@href='*']"));
		
		
	
	
	}

}
