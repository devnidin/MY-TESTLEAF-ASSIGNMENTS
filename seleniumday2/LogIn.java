package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);
        
        driver.findElement(By.linkText("Log Out")).click();
        
	}

}
