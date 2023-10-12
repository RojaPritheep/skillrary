package Scripts;

import org.testng.annotations.Test;
import POM.TestingPage;
import POM.SkillraryHomepage;
import POM.DemoSkillraryAppPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass {
@Test
public void tc1() throws Throwable {
	SkillraryHomepage s=new SkillraryHomepage(driver);
	s.gearsbutton();
	s.skillrarydemoapplink();
	utilities.childBrowser(driver);
	DemoSkillraryAppPage dS=new DemoSkillraryAppPage(driver);
	utilities.dropDown(dS.getSelectDd(), pdata.getpropertyData("coursedd"));
	TestingPage tP=new TestingPage(driver);
	utilities.scrollBar(driver,tP.getFbIcon());
	tP.fbIconWebElement();
	
	

}
}
