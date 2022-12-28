package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstb;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapptb;
	
	@FindBy(name="q")
	private WebElement searchtextbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn;
	
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
      public void gearsTab() {
    	  gearstb.click();
      }
      public void demoapp() {
    	  skillrarydemoapptb.click();
      }
      public void searchtextbox(String name) {
    	  searchtextbox.sendKeys(name);
      }
      public void submitbtn() {
    	  submitbtn.click();
      

    	  }
}
