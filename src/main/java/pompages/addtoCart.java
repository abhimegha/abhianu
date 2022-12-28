package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtoCart {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement aadtocartbtn;
	
	public addtoCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public void aadtoCart() {
		
		aadtocartbtn.click();
		
	}

}
