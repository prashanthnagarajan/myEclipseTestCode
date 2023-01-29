import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Texteditboxes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome driver\\\\Selenium chrome driver ver 103\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		
		
		//1. Fill the test box with gmail
		WebElement Emailbox = driver.findElement(By.id("email"));	
		
		Emailbox.sendKeys("prashanth@gmail.com"); 
		
		
		//2. Append the text box
		WebElement Addwords = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		
		Addwords.sendKeys("Adding text");
		
		//3. Get the value in text box
		WebElement Gettextbox = driver.findElement(By.name("username"));
		String value = Gettextbox.getAttribute("value");
		System.out.println(value);
		
		//WebElement Getvalue  = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		
		//String Value = Getvalue.getAttribute("value");
		 
		//System.out.println(Getvalue);
		
		
		//4. Clear the text box
		WebElement Clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		Clearbox.clear();
		
		
		//5. Check the text box is disabled
		WebElement Disabledbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		String out = Disabledbox.getAttribute("disabled");
		System.out.println(out);
		
		
		 
		//driver.close();
	}

}