import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		
		WebElement Dropdownicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
		Dropdownicon.click();
       
		
		//1. Drop down select by Index
		WebElement Firstdropdown = driver.findElement(By.id("dropdown1"));
		Select selectfirstdropdown = new Select(Firstdropdown);
		selectfirstdropdown.selectByIndex(3);
		selectfirstdropdown.deselectAll();
		
		//2. Drop down select by Visible text
		WebElement Seconddropdown = driver.findElement(By.name("dropdown2"));
		Select selectseconddropdown = new Select(Seconddropdown);
		selectseconddropdown.selectByVisibleText("Loadrunner");
		
		// 3. Drop down select by Value
		WebElement thirddropdown = driver.findElement(By.id("dropdown3"));
		Select selectthirddropdown = new Select(thirddropdown);
		selectthirddropdown.selectByValue("2");
		
		// 4. Get list of drop down
		WebElement fourthdropdown = driver.findElement(By.className("dropdown"));
		Select selectfourthdropdown = new Select(fourthdropdown);
		List<WebElement> listofoptions = selectfourthdropdown.getOptions();
		int  sizeoflistindropdown = listofoptions.size();
		System.out.println(sizeoflistindropdown);
		
		//5. Select option using send keys
		WebElement fifthdropdown = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		fifthdropdown.sendKeys("Appium");
		//String textindropdown = fifthdropdown.getText();
		//System.out.println(textindropdown);
		
		
		//6. Select mutliple options in drop down
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select selectmultipleoption = new Select(multiselect);
		selectmultipleoption.selectByIndex(1);
		selectmultipleoption.selectByIndex(2);
		selectmultipleoption.selectByIndex(3);
		selectmultipleoption.selectByIndex(4);
		
		//Only when i do multiple select , then only i can use 
		//selectfirstdropdown.deselectAll();
		
		
		
		
		
		//driver.close();
		
	}

}
