import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\Selenium chrome driver ver 103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		
		WebElement checkboxicon =  driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/img"));
		checkboxicon.click();
		
		//1. Select the language from check box given
		WebElement selctingonefromcheckboxlist = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
		selctingonefromcheckboxlist.click();
		
		
		//2. Confirm Selenium is checked
		WebElement confirmifitischecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean ifitisselectthentrue = confirmifitischecked.isSelected();
		System.out.println(ifitisselectthentrue);
		
		//3.Deselect the selected checkbox
		WebElement checkboxcheckingtodeselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(checkboxcheckingtodeselect.isSelected()) {
			checkboxcheckingtodeselect.click();
		}
		
		
		WebElement checkboxcheckingtodeselect2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(checkboxcheckingtodeselect2.isSelected()) {
			checkboxcheckingtodeselect2.click();
		}
		
		//4. Select multiple checkbox
		WebElement selectmultiplecheckbox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		selectmultiplecheckbox1.click();
		boolean ifitisselectthentrue1 =selectmultiplecheckbox1.isSelected();
		System.out.println(ifitisselectthentrue1);
		
		
		WebElement selectmultiplecheckbox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		selectmultiplecheckbox2.click();
		boolean ifitisselectthentrue2 =selectmultiplecheckbox1.isSelected();
		System.out.println(ifitisselectthentrue2);
		
		
		WebElement selectmultiplecheckbox3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		selectmultiplecheckbox3.click();
		boolean ifitisselectthentrue3 =selectmultiplecheckbox1.isSelected();
		System.out.println(ifitisselectthentrue3);
		
		
		WebElement selectmultiplecheckbox4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		selectmultiplecheckbox4.click();
		boolean ifitisselectthentrue4 =selectmultiplecheckbox1.isSelected();
		System.out.println(ifitisselectthentrue4);
		
		
		WebElement selectmultiplecheckbox5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		selectmultiplecheckbox5.click();
		boolean ifitisselectthentrue5 =selectmultiplecheckbox1.isSelected();
		System.out.println(ifitisselectthentrue5);
	}

}
