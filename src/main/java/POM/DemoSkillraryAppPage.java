package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryAppPage {
//address of course web element
	@FindBy(id="cousre")
	private WebElement Coursebtn;
	
	//address  of feed back web element
	@FindBy(xpath="//a[text()='FEEDBACK']")
		private WebElement feedBackBtn;
	
	//address of select category drop down
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement selectDd;
	
	//Initialization
	public DemoSkillraryAppPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getCoursebtn() {
		return Coursebtn;
	}
	public WebElement getSelectDd() {
		return selectDd;
	}
	public void feedBackButton() {
		feedBackBtn.click();
	}
	
	
}
