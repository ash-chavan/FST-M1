package activity5_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of page :"+driver.getTitle());
		WebElement checkbox= driver.findElement(By.xpath("//input[@class='willDisappear']"));
		checkbox.click();
		System.out.println("After selecting checkbox "+checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		System.out.println("After clicking remove button "+checkbox.isDisplayed());
		driver.close();

	}

}
