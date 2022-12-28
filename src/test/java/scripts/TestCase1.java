package scripts;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pompages.SkillraryDemoappLogin;
import pompages.SkillraryLogin;
import pompages.addtoCart;

public class TestCase1 extends StepGroup {
	@Test
	public void tc1() {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.gearsTab();
		s.demoapp();
		
		SkillraryDemoappLogin sd=new SkillraryDemoappLogin(driver);
		driverutilities.switchtabs(driver);
	    driverutilities.mouseHover(driver,sd.getCoursetb());
	    sd.seleniumtraingtab();
	    
	    addtoCart ad=new addtoCart(driver);
	    driverutilities.doubleClick(driver,ad.getPlusbtn());
	    ad.aadtoCart();
	    driverutilities.alertPopup(driver);
	    
	    
		
		
	}

}
