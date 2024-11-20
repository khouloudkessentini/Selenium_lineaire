package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
 
		    // Initialize the WebDriver
		WebDriver driver = new ChromeDriver();

	
			// Navigate to Swag Labs website
			driver.get("https://www.saucedemo.com/");

			// Create a FluentWait instance
			Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)) // Total wait time
					.pollingEvery(Duration.ofSeconds(5)) // Polling interval
					.ignoring(NoSuchElementException.class); // Exception to ignore

			// Wait for the username field to be visible
			WebElement username = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id("user-name"));
				}
			});

			// Enter username
			username.sendKeys("standard_user");

			// Wait for the password field to be visible
			WebElement password = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id("password"));
				}
			});

			// Enter password
			password.sendKeys("secret_sauce");

			// Wait for the login button to be clickable
			WebElement loginBtn = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id("login-button"));
				}
			});

			// Click on the login button
			loginBtn.click();

			// Additional actions can go here after logging in
		
			// Close the browser
			driver.quit();
		}
	} 