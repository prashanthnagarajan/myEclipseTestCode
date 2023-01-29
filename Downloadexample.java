

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 93\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		
		WebElement clickonthedownloadicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[18]/a/img"));
		clickonthedownloadicon.click();
		
		
		WebElement clickondownloadexcellink = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]"));
		clickondownloadexcellink.click();
		
		
		//WebElement clickondownloadpdflink = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[2]"));
		//clickondownloadpdflink.click();
		
		//C:\Users\prash\Downloads
		//there is a inbuilt class in selenium to get into files
		File findthefile = new File("C:\\Users\\prash\\Downloads");
		
		//now get the list of files in download list
		File[] listoffilesindownloads = findthefile.listFiles();
		
		
		//go for for each loop 
		for (File file : listoffilesindownloads) 
		{
			
			
			//if file id there we will get an output
			    if(file.getName().equals("testleaf.xlsx")) {
			    System.out.println("file is there");
			    break;
			     
		}
			     
			 //if file is not there it willnot give any output
			   //if (file.getName().equals("ttleaf.xlsx")){
				// System.out.println("file is not there");
				 //break;
			//}
			
			
			
		}
	}
}
			
		
	


