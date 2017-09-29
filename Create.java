package crud_computerdatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create {

	public static void main(String[] args) {
		        // Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();		
		        //Launch the computer database website
				driver.get(" http://computer-database.herokuapp.com/computers");
		        // Click on Add New Computer button
				driver.findElement(By.id("add")).click();
				// Enter computer name
				driver.findElement(By.id("name")).sendKeys("REGAL");
				// Enter introduction date
				driver.findElement(By.id("introduced")).sendKeys("2011-09-22");
				// Enter discontinued date
				driver.findElement(By.id("discontinued")).sendKeys("2016-08-05");
				// Select one of the company from drop down
				Select select = new Select(driver.findElement(By.id("company")));
				select.selectByVisibleText("OQO");
				// Click on create this computer
				driver.findElement(By.xpath("//*[@id=\"main\"]/form/div/input")).click();
				System.out.println("Is new computer added ? : " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText());
				// Close the chrome window
				driver.quit();
	}

}
