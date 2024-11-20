package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoElement {


		    public static void main(String[] args) {
		       
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		       
		    	WebElement linkText = driver.findElement(By.linkText("How to run Selenium tests using Firefox Driver"));

		        // Scroll to the element
		        //JavascriptExecutor js = (JavascriptExecutor) driver;
		        //js.executeScript("arguments[0].scrollIntoView(true);", linkText);
		        
		        //WebElement element = driver.findElement(By.id("elementId"));

		        // Scroll to the element
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", linkText);

		        //Optionally highlight the element
		        js.executeScript("arguments[0].style.border='3px solid red'", linkText);

	}

}