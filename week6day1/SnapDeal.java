package week6day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement mens = driver.findElement(By.xpath("//span[contains(text(),'Fashion')][1]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(mens).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		String shoes= driver.findElement(By.xpath("//span[contains(text(),'Items')]")).getText();
		System.out.println("Shoes count:"+shoes);
		
	}

}
