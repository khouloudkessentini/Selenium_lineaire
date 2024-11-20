package testCases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSwaglabs {

	public static void main(String[] args)  {
		        
		        //Open chrome browser
				WebDriver driver = new ChromeDriver();
				
				//Implicit wait 'generique'
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//Delete cookies
				driver.manage().deleteAllCookies();
				
				//Open url application 
				driver.get("https://www.saucedemo.com/");
				
				//Fill username
				WebElement username = driver.findElement(By.id("user-name"));
				username.clear();
				username.sendKeys("standard_user");
				
				//Fill password
				WebElement password = driver.findElement(By.name("password"));
				password.clear();
				password.sendKeys("secret_sauce");
				
				//Click on login button
	            //loginBtn = driver.findElement(By.xpath("//input[@name='login-button']")); 
	            //loginBtn.click();
	            
	            //Click on login button using Explicit wait 'specifique'
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login-button']")));
	            loginBtn.click();
	            
	            //Validation enter home page
	            String textProduct = driver.findElement(By.xpath("//*[@class='title']")).getText();
	            Assertions.assertEquals(textProduct, "Products");
	            //-------- By.xpath("//*[contains(text(), 'Products')]")
	            
	            //Print screen message
	            System.out.println("Login successfully");
				
				//Kill session/browser
				//driver.quit();
	}

}
