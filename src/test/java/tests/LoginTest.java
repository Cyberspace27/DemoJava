package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTest {
	//MISSING BASE_TEST
	WebDriver driver = null ;
	String projectPath = "";
	LoginPage login ;
  @BeforeTest
  public void setUp() {
	//  projectPath =  System.getProperty("user.dir");
	//  System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
	 
		
	  System.setProperty("webdriver.chrome.driver", "./drivers/bin/chromedriver");
		
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
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
