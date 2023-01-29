import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Framesexamples {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Using Environment Varianle path to initiate chrome
		
		   System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Chrome driver\\\\\\\\Selenium chrome driver ver 103\\\\\\\\chromedriver.exe");
			
		   //open the chrome in maximized window
		   //ChromeOptions chromeoptions =  new ChromeOptions();
		   //chromeoptions.addArguments("--start-maximized");
		   
		   
	       WebDriver driver = new ChromeDriver();
			
		   driver.get("http://www.leafground.com/home.html");
		   
		   Thread.sleep(3000);
		   // Refresh using key event F5
		   Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_F5);
		   robot.keyRelease(KeyEvent.VK_F5);
		   
		   Thread.sleep(3000);
		   WebElement clickontheframesicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img"));
		   clickontheframesicon.click();
		   
		   //Switch the control to iframe
		   //1.Click the button in the frame
		   driver.switchTo().frame(0);
		   WebElement clickthebuttonwithinframe = driver.findElement(By.id("Click"));
		   clickthebuttonwithinframe.click();
		   
		   WebElement getthetextafterclick = driver.findElement(By.id("Click"));
		   String gettingtextafterclick = getthetextafterclick.getText();
		   System.out.println(gettingtextafterclick);
		   
		   //Come out of the frame
		   driver.switchTo().defaultContent();
		   
		   //Switch back to second frame 
		   driver.switchTo().frame(1);
		   //Switch to the frame nested within it and then click the click it button
		   driver.switchTo().frame("frame2");
		   WebElement clickingthebuttoninnestedframe = driver.findElement(By.id("Click1"));
		   clickingthebuttoninnestedframe.click();
		   
		   WebElement getthetextafterclicking2 = driver.findElement(By.id("Click1"));
		   String gettingtextafterclick2 =  getthetextafterclicking2.getText();
		   System.out.println(gettingtextafterclick2);
		   
		   //Come out of nested frames
		   driver.switchTo().defaultContent();
		   
		   //find number of frames in the page
		   List <WebElement> numberoffraomesinpage = driver.findElements(By.tagName("iframe"));
		   int numberofframesperesent = numberoffraomesinpage.size();
		   System.out.println("Number of frames in this webpage :" + numberofframesperesent);
	}

}
