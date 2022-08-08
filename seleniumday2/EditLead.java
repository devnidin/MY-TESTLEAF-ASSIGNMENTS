package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Nidin");
		driver.findElement(By.id("lastNameField")).sendKeys("Dev");
		driver.findElement(By.xpath("(//input[@type='text'])[31]")).sendKeys("Nidin");
		driver.findElement(By.xpath("(//input[@type='text'])[32]")).sendKeys("Dev");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computerscience");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Nothing to fill");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("devnidin@gmail.com");
		
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select st= new Select(State);
		st.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Nothing");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		String title="View Contact | opentaps CRM";
		String title2 = driver.getTitle();
		
		 if(title.equals(title2)) {
	    	  System.out.println("CREATED LEAD SUCCESSFULLY");
	      }else {
	    	  System.out.println("NOT CREATED SUCCESSFULLY");
	      }
	     }
	}


