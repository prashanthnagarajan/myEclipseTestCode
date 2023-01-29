import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchgoogleandgetthesearchresults {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 95\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement clickonthesearchtab = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		clickonthesearchtab.click();
		clickonthesearchtab.sendKeys("Ajith");
		Thread.sleep(3000);
		
		//get all the listed items and store in list
		List <WebElement> lististednameswhilesearched =  driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		
		Thread.sleep(3000);
		
		
		int position = 0;
		
		
		for (WebElement webElement : lististednameswhilesearched) {
			System.out.println(webElement.getText());
			position ++;
			//now give similar word and click
			
			
			//or if(webelement.getText().equals("Game of thrones cast")).

			if (webElement.getText().contains("age")) {
				
				webElement.click();
				break;
				
			}
			
			
			//now give position to them and select by position
			//if (position == 3) {
				
				//webElement.click();
				
				//break;*/
			}
			
		}
		
	
	
	
	
	}


