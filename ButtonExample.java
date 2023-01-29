import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome driver\\\\Selenium chrome driver ver 103\\\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
		
	   driver.get("http://www.leafground.com/home.html");
		
		
	   WebElement ButtonIcon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
	   ButtonIcon.click();
	   
	   //1. Find the location of button
	   WebElement getpositionbutton = driver.findElement(By.id("position"));
	   Point xypoint = getpositionbutton.getLocation();
	   int xValue = xypoint.getX();
	   int yValue = xypoint.getY();
	   
	   System.out.println("Value X "+ xValue +" Value Y "+ yValue );
	   
	   
	   //2. Find the color of button
	   
	   WebElement buttoncoloridentification = driver.findElement(By.id("color"));
	   String colorofbutton = buttoncoloridentification.getCssValue("background-color");
	   System.out.println(colorofbutton);
	   
	   //3. Find the Size of button
	   
	   WebElement Sizeofbutton = driver.findElement(By.id("size"));
	   int Buttonheight = Sizeofbutton.getSize().getHeight();
	   int Buttonwidht = Sizeofbutton.getSize().getWidth();
	   System.out.println("Height = " + Buttonheight );
	   System.out.println("Widht = " + Buttonwidht);
	   
	   //4. Click the button to go to Home Page
	   WebElement ClickButton = driver.findElement(By.id("home"));
	   ClickButton.click();
	   
	   
		//driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		 

	}

}
