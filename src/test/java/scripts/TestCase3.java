package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pompages.SkillraryLogin;
import pompages.Wishlist;
import pompages.selenium;

public class TestCase3 extends StepGroup {
	@Test
	
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryLogin sl=new SkillraryLogin(driver);
		sl.searchtextbox(pdata.getPropertydata("coursename"));
		
		sl.submitbtn();
		
		selenium s=new selenium(driver);
		s.selenium();
		
		Wishlist w=new Wishlist(driver);
		w.popupbtn();
		driverutilities.switchToFrame(driver);
		w.playbtn();
		Thread.sleep(10000);
		w.pausebtn();
		driverutilities.switchbackframe(driver);
		w.wishlist();
		
		
		
	}

}
