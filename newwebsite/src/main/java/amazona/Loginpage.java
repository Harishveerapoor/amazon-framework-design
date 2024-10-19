package amazona;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import page.page;

public class Loginpage extends page {

	public Loginpage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//span[@class='nav-line-2 ']")	
WebElement sinIN;

@FindBy(xpath = "//input[@id='ap_email']")	
WebElement userid;
	
@FindBy(xpath = "//input[@id='continue']")	
WebElement clickingBtn;
	
@FindBy(xpath = "//input[@type='password']")	
WebElement password;

@FindBy(xpath = "//input[@id='signInSubmit']")	
WebElement submit;

// search navbar

@FindBy(xpath = "//input[@placeholder='Search Amazon.in']")	
WebElement searchBox;


// clicking to Addcart button
@FindBy(xpath = "//button[@id='a-autoid-1-announce']")	
WebElement addcart;

//Seeing the discount is their
@FindBy(xpath = "//div[contains(@class,'rush-component s-featured-result-item')]//span[contains(text(),'(49% off)')]")	
WebElement offer;

//Go to cart
@FindBy(xpath = "(//a[@class='a-button-text'])[1]")	
WebElement gotcart;

// Go to quantity select 10 product of same one using 

@FindBy(xpath = "//span[@class='a-dropdown-prompt']")	
WebElement dropdown;

@FindBy(xpath = "//a[@id='quantity_9']")	
WebElement click_select_in_Option;

// Deleting the product
@FindBy(xpath = "//input[@name='submit.delete.9a996d76-2aae-4454-af73-074530395271']")	
WebElement delet;

// update the card

@FindBy(xpath = "//a[@id='a-autoid-0-announce']")	
WebElement update;





//final step for this page
@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
WebElement proceed;

@FindBy(xpath = "//a[@id='add-new-address-popover-link']")
WebElement gotoaddAdrees;

@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
WebElement name;

@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
WebElement phone;

@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
WebElement postalcode;

@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
WebElement Area1;

@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")
WebElement Arae2;

@FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")
WebElement landmark;

@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
WebElement city;

@FindBy(xpath = "//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
WebElement final_submint;






public void login() throws InterruptedException {
	
	sinIN.click();
	userid.sendKeys("9353804347");
	clickingBtn.click();
	password.sendKeys("Harish@6");
	submit.click();
	searchBox.sendKeys("Samsung Galaxy S23 Ultra 5G AI Smartphone");
	searchBox.submit();
	addcart.click();
	offer.getText();
	gotcart.click();
	Thread.sleep(3000);
	dropdown.click();
	Thread.sleep(3000);
	click_select_in_Option.click();
	
//	delet.click();
// update.click();
	
	
	//  final step
	Thread.sleep(1000);
	proceed.click();
	Thread.sleep(1000);
	gotoaddAdrees.click();
	Thread.sleep(1000);
	name.sendKeys("Harish");
	Thread.sleep(1000);
	phone.sendKeys("9353804347");
	Thread.sleep(1000);
	postalcode.sendKeys("583232");
	Thread.sleep(1000);
	Area1.sendKeys("58");
	Thread.sleep(1000);
	Arae2.sendKeys("vinobangar");
	Thread.sleep(1000);
	landmark.sendKeys("near temple");
	Thread.sleep(1000);
	city.sendKeys("  Kuknoor");
	Thread.sleep(1000);
	final_submint.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
