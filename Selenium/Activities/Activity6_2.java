package activity6_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("Title of page :"+driver.getTitle());
		
		WebElement ContentButton = driver.findElement(By.xpath("//button[@class='ui violet button']"));
		ContentButton.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		 String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(ajaxText);
	        
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	        String lateText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(lateText);


		System.out.println("Success..");
		driver.close();
	
		
		
	
		
	}

}
