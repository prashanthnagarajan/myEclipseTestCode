import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//open window in given dimension or resize
		Dimension dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.get("http://www.leafground.com/home.html");
		Thread.sleep(3000);
		//open window in given dimension or resize
		Dimension dimension2 = new Dimension(1300, 700);
		driver.manage().window().setSize(dimension2);
		Thread.sleep(3000);
		
		//refresh page when i used driver.get
		
		driver.get(driver.getCurrentUrl());
		
		
		Thread.sleep(5000);
		
		WebElement Alerticon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img"));
		Alerticon.click();

		
		
		//1. Click on the button to get normal alert box
		WebElement Alertbox1 =  driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		Alertbox1.click();
		Alert alertpopbox1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alertpopbox1.accept();
		
		//2.Click on the button to get confirmation alert box
		WebElement Alertbox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		Alertbox2.click();
		Alert alertpopbox2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alertpopbox2.dismiss();
		
		//3.Click on the button to get Prompt alert box
		WebElement Alertbox3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		Alertbox3.click();
		Alert alertpopbox3 = driver.switchTo().alert();
		Thread.sleep(3000);
		alertpopbox3.sendKeys("entering new text");
		Thread.sleep(3000);
		alertpopbox3.accept();
		
		//4. Click on the button to get another alert box
		WebElement Alertbox5 = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		Alertbox5.click();
		Thread.sleep(3000);
		WebElement alertboxwithoutswitch = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		alertboxwithoutswitch.click();
		
		//driver.close()
	}

}
