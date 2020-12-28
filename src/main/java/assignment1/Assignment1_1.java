package assignment1;

//Use https://letskodeit.teachable.com/p/practice
//1.Enter name in "Enter Your Name" field.Click on Confirm button.Check value entered in the field indeed exists in the messaage
//shown by confirmation window.Close confirmation window by clicking on No button


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://letskodeit.teachable.com/p/practice\r\n" + 
				"");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
		
	}

}
