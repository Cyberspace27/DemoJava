package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class LoginTest {
	
	//MISSING BASE_TEST
	WebDriver driver = null ;
	String projectPath = "";
	LoginPage login = null;
	
  @BeforeTest
  public void setUp() {
	  
	  ChromeOptions chromeOptions = new ChromeOptions();
	  chromeOptions.setHeadless(true);
	  
	  projectPath =  System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver");
	 
//	  System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");	
	  driver = new ChromeDriver();
	  
	  
//	  driver.manage().window().maximize();
//	  driver.get("https://www.google.com/");
//	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	  login = new LoginPage(driver);
	  
  }

  @Test
  public void verifyGoogleSearch() {
	  login.search("Hola Done...!!");
  }
  
  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
