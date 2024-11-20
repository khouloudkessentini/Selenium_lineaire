package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		WebElement btnSubmit = driver.findElement(By.id("submit"));

		fullName.sendKeys("Khouloud Kessentini");
		email.sendKeys("kessentini.khouloud@gmail.com");
		currentAddress.sendKeys("Tunisie");
		
		//Copy Paste
		currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAddress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		btnSubmit.click();
		
		driver.quit();
		
		
	}

}
