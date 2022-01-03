package activity7_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get(" https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of page :"+driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		
		WebElement msg = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		System.out.println("Login Msg"+msg.getText());
		
		System.out.println("Success");
		
		driver.close();
		
	
	
		 
		
		

	}

}
