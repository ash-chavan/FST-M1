package activity2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("URL is Launched..");
		System.out.println("Title of page is : "+driver.getTitle());
		System.out.println("Id Locator :"+driver.findElement(By.id("about-link")).getText());
		System.out.println("Classname Locator"+driver.findElement(By.className("green")).getText());
		System.out.println("Linkedtext locator"+driver.findElement(By.linkText("About Us")).getText());
		System.out.println("Cssselector locator "+driver.findElement(By.cssSelector(".green")));

		driver.close();
		
		//driver.close();

	}

}
