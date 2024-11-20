package testCases;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercice1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://juliemr.github.io/protractor-demo/");
		
		WebElement text1 = driver.findElement(By.xpath("//*[@class='input-small ng-pristine ng-untouched ng-valid']")); 
		text1.clear();
		text1.sendKeys("2");
			
		WebElement btn = driver.findElement(By.xpath("//*[@class='span1 ng-pristine ng-untouched ng-valid']")); 
		Select List = new Select(btn);
		List.selectByVisibleText("*");
		
		WebElement text2 = driver.findElement(By.xpath("//input[@ng-model='second']"));
		text2.clear();
		text2.sendKeys("3");
		
		WebElement btnGO = driver.findElement(By.id("gobutton")); 
		btnGO.click();
		
		WebElement textResult = driver.findElement(By.xpath("//h2[normalize-space()='6']"));
        Assertions.assertEquals(textResult, "6");
        
        //String value = textResult.getText();
		//System.out.println("The value" +value);
        
		//driver.quit();
	}

}
