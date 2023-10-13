package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
//declaration
	// address of add to cart
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addtocart;

	// Initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void addToCart() {
		addtocart.click();
	}

}
