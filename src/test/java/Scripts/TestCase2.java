package Scripts;

import org.testng.annotations.Test;
import POM.InvoicePage;
import POM.DemoSkillraryAppPage;
import POM.SkillraryHomepage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() {
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillraryAppPage dS=new DemoSkillraryAppPage(driver);
		dS.feedBackButton();
		InvoicePage iP=new InvoicePage(driver);
		iP.InvoiceButton();
	}

}
