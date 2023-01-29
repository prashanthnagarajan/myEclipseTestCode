import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome driver\\\\Selenium chrome driver ver 103\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		//open window and then maximize
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/home.html");
		
		Thread.sleep(3000);
		//Refresh using Javascript
		//Using javascriptexecutor interface
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("location reload()");
		
		//or
		
		executor.executeScript("history.go(0)");
		
		Thread.sleep(3000);
		
		//Maximize the window
	
		WebElement Radiobuttonicon =  driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/img"));
		Radiobuttonicon.click();
		
		
		//1. Click on  the radio button
		WebElement Clickontheradiobutton = driver.findElement(By.id("yes"));
		Clickontheradiobutton.click();
		
		//2.Find the default selected radio button
		WebElement statusofcheckboxindefault = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		WebElement statusofcheckboxindefault2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean statusatdefaultuncheckedradiobutton = statusofcheckboxindefault.isSelected();
		boolean statusatdefaultcheckeradiobutton = statusofcheckboxindefault2.isSelected();
		System.out.println(statusatdefaultuncheckedradiobutton);
		System.out.println(statusatdefaultcheckeradiobutton);
		
		//3. Select the age group only if not selected
		WebElement requiredagegroup = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		boolean  agegroupselected = requiredagegroup.isSelected();
		System.out.println(agegroupselected);
		
		driver.close();
	}

}
