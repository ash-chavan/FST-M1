package activiy4_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		System.out.println("URL is Launched..");
		System.out.println("Title of page : "+driver.getTitle());
		
		System.out.println("Xpah Locator"+driver.findElement(By.xpath("//*[@id=\'third-header\']")));
		
		String Color = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("Color of fifth header is :"+Color);
		
		WebElement vio = driver.findElement(By.xpath("//button[contains(@text(),'Violet')]"));
		System.out.println(vio.getAttribute("class"));
		
		WebElement grey = driver.findElement(By.xpath("//div[@class='spaced'/button[2]]")); 
		System.out.println(grey.getText());
		
		driver.close();
		
	}

}
