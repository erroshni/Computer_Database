package crud_computerdatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Update {

	public static void main(String[] args) {
		        // Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();		
		        //Launch the computer database website
				driver.get(" http://computer-database.herokuapp.com/computers");
		        // Search for REGAL
				driver.findElement(By.id("searchbox")).sendKeys("REGAL");
				driver.findElement(By.id("searchsubmit")).click();
				// Click on REGAL
				driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]/a")).click();
				// edit the computer REGAL info
				driver.findElement(By.id("name")).clear();
				driver.findElement(By.id("name")).sendKeys("NEWREGAL");
				driver.findElement(By.id("introduced")).clear();
				driver.findElement(By.id("introduced")).sendKeys("2012-10-22");
				driver.findElement(By.id("discontinued")).clear();
				driver.findElement(By.id("discontinued")).sendKeys("2017-09-06");
				Select select = new Select(driver.findElement(By.id("company")));
				select.selectByVisibleText("Sony");
				// Click on save this computer
				driver.findElement(By.xpath("//*[@id=\"main\"]/form/div/input")).click();
				System.out.println("Is computer Updated ? : " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText());
				driver.quit();
	}
}
