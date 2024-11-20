package testCases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_EdgeDriver {

	public static void main(String[] args) {
    
		WebDriver driver = new EdgeDriver();  //firefoxDriver //EdgeDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");

        //Instantiate Actions class
		Actions actions = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRightClick).build().perform();    //bouton droit
		
		//Validation
		String text = driver.findElement(By.id("rightClickMessage")).getText();
		Assertions.assertEquals(text, "You have done a right click");
		
		driver.quit();
		
		
	}

}
