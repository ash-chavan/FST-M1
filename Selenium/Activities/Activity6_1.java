package activity6_1;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new  WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of page :"+driver.getTitle());
		WebElement Toggle = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		WebElement Checkbox = driver.findElement(By.xpath("//input[@name='toggled']"));

		Toggle.click();
		
		wait.until(ExpectedConditions.invisibilityOf(Checkbox));
		Toggle.click();
		
		wait.until(ExpectedConditions.visibilityOf(Checkbox));
		Checkbox.click();
		
		System.out.println("Succesfull.");
		driver.close();
   

	}

}
