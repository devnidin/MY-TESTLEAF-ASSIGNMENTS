package seleniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafCheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
		
		
      driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
		
		
	  String text = driver.findElement(By.tagName("h2")).getText();
      System.out.println(text);
     
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();	
      driver.findElement(By.linkText("Create Lead")).click();
     
      WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
      CompanyName.clear();
      CompanyName.sendKeys("Qeagle");
      
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nidin");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dev");
      
      WebElement DataSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
      Select dsr= new Select(DataSource);
      dsr.selectByVisibleText("Existing Customer");
      WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
      Select mar=new Select(Marketing);
      mar.selectByVisibleText("Demo Marketing Campaign");
      WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
      Select ind= new Select(Industry);
      ind.selectByVisibleText("Computer Software");
      WebElement Currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
      Select cur= new Select(Currency);
      cur.selectByVisibleText("INR - Indian Rupee");
      WebElement OwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
      Select owe=new Select(OwnerShip);
      owe.selectByVisibleText("Sole Proprietorship");
    
    
      driver.findElement(By.name("submitButton")).click();
      
      
      String title="View Lead | opentaps CRM";
      String title2 = driver.getTitle();
      
      
      if(title.equals(title2)) {
    	  System.out.println("CREATED LEAD SUCCESSFULLY");
      }else {
    	  System.out.println("NOT CREATED SUCCESSFULLY");
      }
     }

}
