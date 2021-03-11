package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver = null;
	
	public BasePage(WebDriver currentDriver) {

		this.driver = currentDriver;
		PageFactory.initElements(currentDriver, this);
	}
	
	public void typeInElement(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void clickInElement(WebElement element) {
		element.click();
	}
	
}
