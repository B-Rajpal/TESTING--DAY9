package Practice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;

public class Task4 {
	WebDriver driver;
  @Test
  public void function() throws InterruptedException {
	  System.out.println(driver.getCurrentUrl());
	  driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
  }
  @Parameters({"browser"})
  @BeforeMethod
  public void beforeMethod(String browsername) throws InterruptedException {
	  if(browsername.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(co);
	  }
	  else if (browsername.equals("edge")) {
		  WebDriverManager.edgedriver().setup();
		  EdgeOptions eo = new EdgeOptions();
		  eo.addArguments("--remote-allow-origins=*");
		  driver = new EdgeDriver(eo);
	  }
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
