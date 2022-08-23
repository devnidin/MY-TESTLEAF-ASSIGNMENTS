package week6day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		WebElement mouse = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions builder =new Actions(driver);
		builder.moveToElement(mouse).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Paris')][1]")).click();
		
		String title= driver.findElement(By.xpath("//div[@id='title']")).getText();
		System.out.println(title);
		
		}
		
	}

