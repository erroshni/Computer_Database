package crud_computerdatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read {

	public static void main(String[] args) {
		        // Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();		
		        //Launch the computer database website
				driver.get(" http://computer-database.herokuapp.com/computers");
		        // Search REGAL
				driver.findElement(By.id("searchbox")).sendKeys("REGAL");
				driver.findElement(By.id("searchsubmit")).click();
				// Read the info of REGAL computer
				System.out.println("Name of the Computer : " + driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]")).getText());
				System.out.println("Date introduced : " + driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[2]")).getText());
				System.out.println("Date discontinued : " + driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[3]")).getText());
				System.out.println("Company : " + driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[4]")).getText());
				driver.quit();
	}

}
