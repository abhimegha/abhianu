package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	
	@FindBy(xpath="//a[text()=\"X\"]")
	private WebElement popupbtn;
	
	public Wishlist(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public void playbtn() {
		playbtn.click();
	}
	public void pausebtn() {
		pausebtn.click();
	}
	public void wishlist() {
		wishlistbtn.click();
	}
	public void popupbtn() {
		popupbtn.click();
	}

}

