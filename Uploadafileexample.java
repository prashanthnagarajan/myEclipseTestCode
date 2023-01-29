
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadafileexample {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 93\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		
		WebElement clickontheuploadfileicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[19]/a/img"));
		clickontheuploadfileicon.click();
		
		WebElement clickonchoosefile = driver.findElement(By.name("filename"));
		clickonchoosefile.click();
		
		
		Thread.sleep(9000);
		
		//now the local window screen opens up
		//to get the control to the local screen there is a class
		//the file which going to be uploaded the file location should be saved in a string
		
		String file = ("C:\\Users\\prash\\Downloads\\testleaf.xlsx");
		
		//Now we should change the path name to selenium understandable plain text
		//use the class Stringselection
		
		StringSelection selectthefile = new StringSelection (file);
		
		//after this now select the toolkit class to search in local window
		//the path i copied will be stored in the clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectthefile, null);
		
		//earlier we tried with "actions" to interact with the keyboard action now we can use Robot class
		
		Robot controltokeyboard = new Robot ();
		controltokeyboard.keyPress(KeyEvent.VK_CONTROL);
		controltokeyboard.keyPress(KeyEvent.VK_V);
		controltokeyboard.keyRelease(KeyEvent.VK_V);
		controltokeyboard.keyRelease(KeyEvent.VK_CONTROL);
		controltokeyboard.keyPress(KeyEvent.VK_ENTER);
		controltokeyboard.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
