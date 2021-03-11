package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver currentDriver) {
		super(currentDriver);
		
	}
	
	// I believe this is the best way or the standart 
	@FindBy(how = How.ID, using = "")
	private WebElement txtUser;
	
	@FindBy(name = "")
	private WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "q")
	private WebElement txtSearch;
	
	//missing method to type and click from basePage
	public void search(String val) {
		typeInElement(txtSearch, val);
	}
	public DashboardPage logIn() {
		//ACTION NEED TO BE IMPLEMENTED
		return new DashboardPage();
	}
	

}
