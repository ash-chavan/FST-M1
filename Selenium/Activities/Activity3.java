package activity3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("URL is Launched..");
		System.out.println("Title of page is : "+driver.getTitle());
		WebElement Fname = driver.findElement(By.id("firstName"));
		Fname.sendKeys("Ashwini");
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("a@gmail.com");
		
		WebElement Contact = driver.findElement(By.id("number"));
		Contact.sendKeys("9956054534");
		
		driver.findElement(By.className("green")).click();
		
		System.out.println("Succesfull..");
		
		driver.close();

		
		
		

	}

}
