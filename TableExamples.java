

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 95\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/home.html");

		WebElement Clickontableicon =  driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img"));
		Clickontableicon.click();
		
		//Get the number of columns
		List<WebElement> noofcoloumns = driver.findElements(By.tagName("th"));
		int totalnoofcolumn = noofcoloumns.size();
		System.out.println("Total number of Column"+   totalnoofcolumn);
		
		//Get the number of rows
		List<WebElement> noofrows = driver.findElements(By.tagName("tr"));
		int totalnoofrows = noofrows.size();
		System.out.println("Total number of Row" +   totalnoofrows);
		
		//Get the progress value in the table
		WebElement getthevaluenexttoLearntointeractwithElements = driver.findElement(By.xpath("//tr[td='Learn to interact with Elements']/child::td[2]"));
		String getthevalue = getthevaluenexttoLearntointeractwithElements.getText();
		System.out.println("Value next to this column " +  getthevalue);
		
		
		//Get the vital task and click on low score
		//Get all the values stored in list and compare them
		
		List<WebElement> getalltheprogressvalues = driver.findElements(By.xpath("//td[2]"));
		for (WebElement webElement : getalltheprogressvalues) {
			
			String gettingonlyvalues = webElement.getText().replace("%", " ");
			
			//Convert the string value into number
			int convertingstringtonumber = Integer.parseInt(gettingonlyvalues);
			
			
			
			System.out.println(convertingstringtonumber);
			
			
			
			
			
		}
		
		
	}
	
	
	

}
