package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		
		//info bulle sur un boutton 'ToolTips ou Title'
		WebElement btnHoverMetosee = driver.findElement(By.id("toolTipButton"));
		String toolTipText = btnHoverMetosee.getText();  
		
		if (toolTipText.equals("Hover me to see")) {
			System.out.println("Pass : tooTip matching expected value");
		} else {
			System.out.println("Fail : tooTip is not matching expected value");
		}
		
		driver.quit();
			
	}

}