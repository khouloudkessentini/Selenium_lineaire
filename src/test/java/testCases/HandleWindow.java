package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement pub = driver.findElement(By.xpath("//iframe[@id='a077aa5e']")); 
	    pub.click();
	    
	    for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);	
			
			//NE9ESS LE CLASSE 5EDMA
	}

}
}
