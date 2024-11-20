package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;

public class SendKeysWithJavaScriptExecuter {
	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?locale=fr_FR");

		// Fill email and kenKeys with JavascriptExecutor
		WebElement emailInput = driver.findElement(By.name("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'kessentini.khouloud@gmail.com';", emailInput);

		// Fill password and kenKeys with JavascriptExecutor
		WebElement passwordInput = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].value = 'password';", passwordInput);

		// Click on login Button
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

		// driver.quit();
	}

}

//driver.get("https://demoqa.com/text-box");

// *Locate the input element
//WebElement inputElement = driver.findElement(By.id("userName"));

// *Use JavaScript to send keys
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].setAttribute('value', 'khouloud');", inputElement);