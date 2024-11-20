package testCases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		//Get Element Color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
        Color color1 = Color.fromString(color);
        String actualColor = color1.asHex();
        Assertions.assertEquals("#007bff", actualColor);
		
	}

}
