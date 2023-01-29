import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 93\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		
		WebElement Windowicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img"));
		Windowicon.click();
		
		//Get the window control
		String parentwindow = driver.getWindowHandle();
		
		WebElement clickingonthetab = driver.findElement(By.id("home"));
		clickingonthetab.click();
		//Giving the control to child window
		Set<String> childwindow = driver.getWindowHandles();
		
		for (String Newwindow : childwindow) {
			
			driver.switchTo().window(Newwindow);
		}
		
				WebElement newlyopenedtabclicktxticon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
				newlyopenedtabclicktxticon.click();
		
		//1. Fill the test box with gmail in child window
				WebElement Emailbox = driver.findElement(By.id("email"));	
				
				Emailbox.sendKeys("prashanth@gmai.com"); 
		
				driver.close();
		
		//we can use this statement to get back the control to parent window or else we can use the other sentence also
		driver.switchTo().window(parentwindow);
		//driver.switchTo().defaultContent();		  
		
		
		
		//2.Operation in main window again and get the number of windows opened
		WebElement openmultiplewindowtab = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openmultiplewindowtab.click();
		
		int numberofwindowsopened = driver.getWindowHandles().size();
		System.out.println("Widows opened=" + numberofwindowsopened);
		
		
		//3.Close the child windows except parent window
		
		WebElement openmultiplewindowtabandclosethechildwindow = driver.findElement(By.id("color"));
		openmultiplewindowtabandclosethechildwindow.click();
		//give the control to the child windows
		Set<String> multiplechildwindow = driver.getWindowHandles();
		
		for (String newlyMultiplechildwindows : multiplechildwindow) {
			driver.switchTo().window(newlyMultiplechildwindows);
			 
			
			
		    }
		
		    driver.close();
		
		//coming back to main window
		driver.switchTo().window(parentwindow);
		//give the control to the child windows again
		Set<String> multiplechildwindow2 = driver.getWindowHandles();
		
		for (String newlyMultiplechildwindows2 : multiplechildwindow2) {
			driver.switchTo().window(newlyMultiplechildwindows2);
			
		    }
		
		
		    driver.close();
		
		    
		//the above method i did by my own,the below method was given in youtube
		
			//if(!newlyMultiplechildwindows.equals(parentwindow));{
			//driver.switchTo().window(newlyMultiplechildwindows);
			//driver.close();
			//}
			
	
			
		//}
			
		}
		
		  //driver.close();
	}


