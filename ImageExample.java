


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 93\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		
		
		WebElement clickonimageicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img"));
		clickonimageicon.click();
		
		
		//1.Check the image i am broken
		
				WebElement checktheimage1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
				
				//now check the nautralwidth attribute of image
				
				if (checktheimage1.getAttribute("naturalWidth").equals("0")) {
					
					System.out.println("This image is broken ");
					
				} else {
					System.out.println("This image is not broken");
				}
		
		//2.Check the image i am broken
		
		WebElement checktheimage2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		//now check the nautralwidth attribute of image
		
		if (checktheimage2.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("This image is broken ");
			
		} else {
			System.out.println("This image is not broken");

		}
		//3.Check the image i am broken
		
				WebElement checktheimage3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
				
				//now check the nautralwidth attribute of image
				
				if (checktheimage3.getAttribute("naturalWidth").equals("0")) {
					
					System.out.println("This image is broken ");
					
				} else {
					System.out.println("This image is not broken");

				}
				
				
				Thread.sleep(3000);
		//4.Click on the image using mouse or keyboard
				WebElement checktheimagesame3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
				Actions actionwithmouse = new Actions (driver);
				actionwithmouse.click(checktheimagesame3).build().perform();
				
				
	
	}

}
