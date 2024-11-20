package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		//Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println("The first window name is : " +handle);
		
		WebElement btnNewWindowMessage = driver.findElement(By.id("messageWindowButton"));
		btnNewWindowMessage.click();
		
		Set<String> handles = driver.getWindowHandles(); //Affichage tableau 'Set<String>' plusieur chaine de caractéres 
		System.out.println("The first window name is : " +handles);

		//Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);	
		}
		
		driver.close();
	}

}
