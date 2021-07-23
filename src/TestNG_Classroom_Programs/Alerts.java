package TestNG_Classroom_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;
	
  @Test
  public void handlingalerts() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
	  
Thread.sleep(6000);
	  
	 // driver.switchTo().alert().accept();

String str = driver.switchTo().alert().getText();
System.out.println(str);
	  
driver.switchTo().alert().accept();	  
	  
  }
  
  
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Ravanda_Rules_Workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  driver.quit();
	  
  }

}
