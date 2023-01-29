

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkexamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Chrome driver\\\\Selenium chrome driver ver 96\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/home.html");
		
		WebElement clickoniconhyperlink = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img"));
		clickoniconhyperlink.click();
		
		//1. Find where the link should go without clicking the link
		//the link details will be given in href attribute
		
		WebElement findthelinkshouldgowithoutclicking = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String thelinkwillgoto = findthelinkshouldgowithoutclicking.getAttribute("href");
		System.out.println("this is the link the hperlink will go to " + thelinkwillgoto);
		
		//2.Verify i am broken
		//Either i can do it by java or i can check the page title
		
		WebElement verifythelinkisbroken = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a"));
		verifythelinkisbroken.click();
		String checkthetitlle = driver.getTitle();
		
		if (checkthetitlle.contains("404")) {
			System.out.println("The link is broken");
			
		} else {
			
			System.out.println("The link is not broken");

		}
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		//3.Check how many link are available in this page
		//whenever you have more than one element use find elements
		
		List<WebElement> getthelistoflinks = driver.findElements(By.tagName("a"));
		int nooflist = getthelistoflinks.size();
		System.out.println("No of links in this page " + nooflist);
	
	
	}

}
