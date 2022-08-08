package seleniumday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nidin");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Dev");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("12345678@gamil.com");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("12345678@gamil.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("12345678");
		
		
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		Select d1= new Select(Date);
		d1.selectByValue("8");
		
		WebElement Months = driver.findElement(By.xpath("//select[@id='month']"));
		Select m1= new Select(Months);
		m1.selectByIndex(5);
		
		WebElement Dob = driver.findElement(By.xpath("//select[@id='year']"));
		Select y1= new Select(Dob);
		y1.selectByValue("1999");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}

}
