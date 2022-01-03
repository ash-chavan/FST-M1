package activity4_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("URL is Launched..");
		
		WebElement Fname = driver.findElement(By.xpath("//*[@id=\'firstName\']"));
		Fname.sendKeys("Ashwini");
		
		WebElement Lname = driver.findElement(By.xpath("//*[@id=\'lastName\']"));
		Lname.sendKeys("Chavan");
		
		WebElement Email = driver.findElement(By.xpath("//*[@id=\'email\']"));
		Email.sendKeys("a@gmail.com");
		
		WebElement Contact = driver.findElement(By.xpath("//*[@id=\'number\']"));
		Contact.sendKeys("9956054534");
		
		driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();
		
		System.out.println("Succesfull..");
		
		driver.close();

	}

}
