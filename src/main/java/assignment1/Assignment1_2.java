package assignment1;


//2.Use following link:
//https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
//Click TryIt button.Once prompt alert will be shown,enter Name in the edit field of prompt box. and close the alert


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_2 {
	public static WebDriver driver;

	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		WebElement Frame13 = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(Frame13);
		driver.findElement(By.xpath("//html/body/button")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
//html/body/button