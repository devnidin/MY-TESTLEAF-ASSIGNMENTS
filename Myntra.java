package week6day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		//invoking the webdrivder.
		ChromeDriver driver = new ChromeDriver();
		// inslicing the object
		driver.get("https://www.myntra.com/");
		// giving the url
		driver.manage().window().maximize();
		// maximaizing the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//giving implicity wait
		
	WebElement pro = driver.findElement(By.xpath("//span[text()=\"Profile\"]"));
	pro.click();

	

	}

}
