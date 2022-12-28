package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoappLogin {
	@FindBy(id="course")
	private WebElement coursetb;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingtb;
	
	

	@FindBy(name="addresstype")
	private WebElement categorydd;
	
	


  public SkillraryDemoappLogin(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }


public WebElement getCoursetb() {
	return coursetb;
}
 
  public void seleniumtraingtab() {
	  seleniumtrainingtb.click();
  }


public WebElement getCategorydd() {
	return categorydd;
}
  
  }
	  
  
