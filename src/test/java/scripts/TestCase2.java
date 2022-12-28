package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pompages.SkillraryDemoappLogin;
import pompages.SkillraryLogin;
import pompages.Testing;

public class TestCase2 extends StepGroup {
	@Test
	public void tc2() throws IOException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.gearsTab();
		s.demoapp();
		
	SkillraryDemoappLogin sd=new SkillraryDemoappLogin(driver);	
	driverutilities.switchtabs(driver);
    driverutilities.dropdown(sd.getCategorydd(),pdata.getPropertydata("catagory"));
    
    Testing t=new Testing(driver);
    driverutilities.draganddrop(driver,t.getSeleniuntraining(),t.getCart());
   Point loc = t.getFacebook().getLocation();
  int x = loc.getX();
   int y = loc.getY();
   driverutilities.scrollBar(driver, x, y);
   t.facebookico();
	}
}
   
   


