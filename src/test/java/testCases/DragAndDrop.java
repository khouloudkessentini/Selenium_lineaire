package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/droppable/");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		
	    //Verify text changed into dropped!
		String textTraget = target.getText();
		if(textTraget.equals("Dropped!")) {
			System.out.println("Pass: Source is dropped to target as expected");
		}
		else {
			System.out.println("Fail: Source could not be dropped to target as expected");
		}
		
		//Assertions.assertEquals(textTraget, "Dropped!");

		driver.quit();
		}
		
	}


