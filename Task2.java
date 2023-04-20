package Practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	 @SuppressWarnings("deprecation")
	@Test
	  public void Test1() {
		  WebDriverManager.chromedriver().setup();
			WebDriver  driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.get("https://www.godaddy.com/en-in");
			driver.manage().window().maximize();
			String actualTitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
			String extractedTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, extractedTitle);
			String actualURL="https://www.godaddy.com/en-in";
			String extractedURL=driver.getCurrentUrl();
			Assert.assertEquals(actualURL, extractedURL);
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);	
			driver.quit();
	  }
	  @SuppressWarnings("deprecation")
	@Test
	  public void Test2() {
		  WebDriverManager.chromedriver().setup();
			WebDriver  driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.get("https://www.godaddy.com/en-in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
			driver.findElement(By.linkText("Domain Name Search")).click();
			driver.quit();
	  }
	  @SuppressWarnings("deprecation")
	@Test
	  public void Test3() {
		  WebDriverManager.chromedriver().setup();
			WebDriver  driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.get("https://www.godaddy.com/en-in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
			String titl=driver.getTitle();
			System.out.println("Title="+titl);
			driver.quit();
	  }

}
