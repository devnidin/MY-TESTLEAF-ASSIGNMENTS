package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("devnidin@mail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("TestLeaf",Keys.TAB);
          
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		
		
		

	}

}
