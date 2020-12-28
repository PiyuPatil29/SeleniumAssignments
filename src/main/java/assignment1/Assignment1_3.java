package assignment1;

//3.Use link below:
//https://letskodeit.teachable.com/p/practice
//Type course name in the search field of Iframe given in Iframe example section

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		WebElement Frame1=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(Frame1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control search input-lg']")).sendKeys("Piyu");
		System.out.println("Switch on frame");
	}
}
