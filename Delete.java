package crud_computerdatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) {
		        // Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();		
		        //Launch the computer database website
				driver.get(" http://computer-database.herokuapp.com/computers");
		        // Search REGAL
				driver.findElement(By.id("searchbox")).sendKeys("REGAL");
				driver.findElement(By.id("searchsubmit")).click();
				// Click on REGAL
				driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]/a")).click();	
				// Click on delete this computer
				driver.findElement(By.xpath("//*[@id=\"main\"]/form[2]/input")).click();
				System.out.println("Is computer Deleted ? : " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText());
	}
}
