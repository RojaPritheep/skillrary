package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	// declaration
	// address of invoice webelement
	@FindBy(xpath = "//input[@name='downloadInvoice']")
	private WebElement InVoiceBtn;

	// intilization
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void InvoiceButton() {
		InVoiceBtn.click();
	}
}
