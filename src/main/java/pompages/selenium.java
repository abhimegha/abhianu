package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selenium {
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement selenium;
	
	public selenium(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void selenium() {
		selenium.click();
	}

}
