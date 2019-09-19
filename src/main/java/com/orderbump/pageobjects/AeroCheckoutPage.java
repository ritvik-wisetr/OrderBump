package com.orderbump.pageobjects;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orderbump.generics.WaitStatementLib;
import com.orderbump.generics.WebDriverCommonLib;

public class AeroCheckoutPage 
{
	final String jsCode="arguments[0].scrollIntoView(true)";
	
	@FindBy(xpath="//a[text()='Click here to login']")
	private WebElement login;
	@FindBy(id="username")
	private WebElement un;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	@FindBy(id="billing_email")
	private WebElement email;
	@FindBy(id="account_password")
	private WebElement pwd;
	@FindBy(id="createaccount")
	private WebElement createAcntChkbox;
	@FindBy(id="account_username")
	private WebElement acntUsername;
	@FindBy(id="account_password")
	private WebElement acntPassword;
	@FindBy(id="billing_first_name")
	private WebElement firstName;
	@FindBy(id="billing_last_name")
	private WebElement lastName;
	
	@FindBy(id="shipping_first_name")
	private WebElement shippingFirstName;
	@FindBy(id="shipping_last_name")
	private WebElement shippingLastName;
	@FindBy(id="shipping_address_1")
	private WebElement address;
	@FindBy(id="shipping_city")
	private WebElement city;
	@FindBy(id="shipping_postcode")
	private WebElement postcode;
	@FindBy(id="shipping_country")
	private WebElement shippingCountryDrpDown;
	@FindBy(id="shipping_state")
	private WebElement shippingStateDrpDown;
	@FindBy(xpath="//span[@id='select2-shipping_state-container']")
	private WebElement state;
	@FindBy(id="billing_phone")
	private WebElement phone;
	@FindBy(xpath="//span[@id='select2-shipping_country-container']")
	private WebElement country;
	
	@FindBy(id="shipping_same_as_billing")
	private WebElement shippingChkBox;
	@FindBy(id="billing_same_as_shipping")
	private WebElement billingChkBox;
	@FindBy(xpath="(//input[@id='billing_first_name'])[2]")
	private WebElement billingFirstName;
	@FindBy(xpath="(//input[@id='billing_last_name'])[2]")
	private WebElement billingLastName;
	@FindBy(id="billing_address_1")
	private WebElement billingAddress;
	@FindBy(id="billing_city")
	private WebElement billingCity;
	@FindBy(id="billing_postcode")
	private WebElement billingPostcode;
	@FindBy(id="billing_country")
	private WebElement billingCountryDrpDown;
	@FindBy(id="billing_state")
	private WebElement billingStateDrpDown;
	
	@FindBy(id="shipping_method_0_local_pickup4")
	private WebElement localPickup;
	@FindBy(id="shipping_method_0_free_shipping3")
	private WebElement freeShipping;
	@FindBy(id="shipping_method_0_flat_rate1")
	private WebElement flatRate;
	@FindBy(xpath="//ul[@id='shipping_method']")
	private WebElement shippingMessage;
	
	@FindBy(xpath="//h2[contains(text(),'Payment Information')]")
	private WebElement xp;
	@FindBy(xpath="//h2[contains(text(),'Your Products')]")
	private WebElement xp1;
	@FindBy(xpath="//div[@class='wfacp_order_summary_container']/..//tr[@class='shipping_total_fee']")
	private WebElement xp2;
	@FindBy(xpath="//div[@class='wfacp_single_coupon_msg']")
	private WebElement xp3;
	@FindBy(xpath="//h2[contains(text(),'Shipping Method')]")
	private WebElement xp4;
	@FindBy(xpath="//h3[contains(text(),'INCLUDED IN YOUR PLAN?')]")
	private WebElement xp5;
	
	@FindBy(xpath="//input[contains(@id,'5d77870dd7bd6')]/../..//a[text()='Choose an option']")
	private WebElement variableProdOptionLink;
	@FindBy(xpath="//input[contains(@id,'5d77870de964e')]")
	private WebElement simpleSubsProds;
	@FindBy(xpath="//input[contains(@id,'5d77870defe96')]/../..//a[text()='Choose an option']")
	private WebElement varSubsProdOptionLink;
	
	@FindBy(className="wfacp_showcoupon")
	private WebElement showcoupon;
	@FindBy(id="wfacp_coupon_code_field")
	private WebElement couponTxtBox;
	@FindBy(name="apply_coupon")
	private WebElement applyCouponBtn;
	
	@FindBy(xpath="//div[@class='wfacp_coupon_field_msg']")
	private WebElement couponFieldMsg;
	@FindBy(xpath="//div[@class='wfacp_single_coupon_msg']")
	private List<WebElement> singleCouponMsg;
	@FindBy(xpath="//div[@class='wfacp_coupon_error_msg']")
	private WebElement couponErrorMsg;
	@FindBy(xpath="//div[@class='wfacp_coupon_remove_msg']")
	private WebElement couponRemoveMsg;
	
	@FindBy(id="terms")
	private WebElement chkBox;
	@FindBy(id="place_order")
	private WebElement order;
	
	public AeroCheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void existingUser()
	{
		login.click();
		un.sendKeys("ritvik@tact9.in");
		password.sendKeys("admin");
		loginBtn.click();
	}
	
	public void accountLogin()
	{
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		email.sendKeys(formattedDate+"@tact9.in");
		createAcntChkbox.click();    
		acntUsername.sendKeys(formattedDate+"@tact9.in");
		acntPassword.sendKeys(formattedDate+"@tact9.in");
		firstName.sendKeys("ritvik");
		lastName.sendKeys("raj");
		address.sendKeys("janakpuri");
		city.sendKeys("delhi");
		postcode.sendKeys("110058");
		WaitStatementLib.iSleep(1);
		phone.sendKeys("1234567890");
	}
	
	public void shippingInformation()
	{
		email.sendKeys("ritvik@tact9.in");
		firstName.sendKeys("ritvik");
		lastName.sendKeys("raj");
		address.sendKeys("janakpuri");
		city.sendKeys("delhi");
		postcode.sendKeys("110058");
		WaitStatementLib.iSleep(1);
		phone.sendKeys("1234567890");
	}
	
	public void virtualProdAcntLogin()
	{
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		email.sendKeys(formattedDate+"@tact9.in");   
		acntUsername.sendKeys(formattedDate+"@tact9.in");
		acntPassword.sendKeys(formattedDate+"@tact9.in");
		firstName.sendKeys("ritvik");
		lastName.sendKeys("raj");
		address.sendKeys("janakpuri");
		city.sendKeys("delhi");
		postcode.sendKeys("110058");
		WaitStatementLib.iSleep(1);
		phone.sendKeys("1234567890");
	}
	
	public void billingInformation()
	{
		billingChkBox.click();
		billingAddress.sendKeys("manhatten");
		billingCity.sendKeys("kansas");
		billingPostcode.sendKeys("66103");
		WaitStatementLib.iSleep(3);
		WebDriverCommonLib.selectOptionByValue(billingCountryDrpDown, "US");
	}
	
	public void shippingState(String countryState)
	{
		WebDriverCommonLib.selectOptionByValue(shippingStateDrpDown, countryState);
		WaitStatementLib.iSleep(2);
	}
	
	public void shippingCountry(String countryValue)
	{
		WebDriverCommonLib.selectOptionByValue(shippingCountryDrpDown, countryValue);
		WaitStatementLib.iSleep(2);
	}
	
	public void billingState(String countryState)
	{
		WebDriverCommonLib.selectOptionByValue(billingStateDrpDown, countryState);
		WaitStatementLib.iSleep(2);
	}
	
	public void billingCountry(String countryValue)
	{
		WebDriverCommonLib.selectOptionByValue(billingCountryDrpDown, countryValue);
		WaitStatementLib.iSleep(2);
	}
	
	public void email()
	{
		email.sendKeys("ritvik@tact9.in");
	}
	
	public void name()
	{
		firstName.clear();
		firstName.sendKeys("prashant");
		lastName.clear();
		lastName.sendKeys("arjun");
	}
	
	public void shippingCheckBox()
	{
		shippingChkBox.click();
	}
	
	public void shippingName()
	{
		shippingFirstName.sendKeys("ritvik");
		shippingLastName.sendKeys("raj");
	}
	
	public void shippingAddress()
	{
		address.sendKeys("karol bagh");
		city.sendKeys("delhi");
		postcode.sendKeys("110001");
		WebDriverCommonLib.selectOptionByValue(shippingCountryDrpDown, "IN");
	}
	
	public void billingCheckBox()
	{
		billingChkBox.click();
	}
	
	public void billingName()
	{
		billingFirstName.sendKeys("harish");
		billingLastName.sendKeys("bajaj");
	}
	
	public void billingAddress()
	{
		billingAddress.sendKeys("janakpuri");
		billingCity.sendKeys("delhi");
		billingPostcode.sendKeys("110058");
		WaitStatementLib.iSleep(3);
		WebDriverCommonLib.selectOptionByValue(billingCountryDrpDown, "IN");
	}
	
	public void phoneNo()
	{
		phone.sendKeys("1234567890");
	}
	
	public void selectLocalPickup()
	{
		WaitStatementLib.iSleep(1);
		localPickup.click();
		WaitStatementLib.iSleep(3);
	}
	
	public void selectFreeShipping()
	{
		WaitStatementLib.iSleep(1);
		freeShipping.click();
		WaitStatementLib.iSleep(3);
	}
	
	public void selectFlatRate()
	{
		WaitStatementLib.iSleep(1);
		flatRate.click();
		WaitStatementLib.iSleep(3);
	}
	
	public void showShippingMethod(WebDriver driver)
	{
		WaitStatementLib.iSleep(1);
		WebDriverCommonLib.elementDisplay("Shipping Method Section", xp4, driver);
		WaitStatementLib.iSleep(1);
	}
	
	public void showProduct(WebDriver driver)
	{
		WaitStatementLib.iSleep(1);		
		WebDriverCommonLib.elementDisplay("Your Products Section", xp1, driver);
		WaitStatementLib.iSleep(2);
	}
	
	public void showWhatsIncluded(WebDriver driver)
	{
		WaitStatementLib.iSleep(1);		
		WebDriverCommonLib.elementDisplay("What's Included In Your Plan Section", xp5, driver);
		WaitStatementLib.iSleep(1);
	}
	
	public void optionsLink()
	{
		variableProdOptionLink.click();
	}
	
	public void selectSimpleSubscriptionProduct()
	{
		WaitStatementLib.iSleep(2);
		simpleSubsProds.click();
		WaitStatementLib.iSleep(2);
	}
	
	public void variableSubsProdsOptionsLink()
	{
		varSubsProdOptionLink.click();
	}
	
	public void couponApply(String coupon)
	{
		WaitStatementLib.iSleep(2);
		showcoupon.click();
		couponTxtBox.sendKeys(coupon);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(2);
	}
	
	public void removeCoupon() 
	{
		WaitStatementLib.iSleep(2);
		couponTxtBox.clear();
	}
	
	public void applySingleCoupon(String coupon,int year, int month, int date) throws ParseException
	{
		couponTxtBox.clear();
		couponTxtBox.sendKeys(coupon);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(3);
		LocalDate todayDate = LocalDate.now();
	    LocalDate expiryDate = LocalDate.of(year, month, date);	    
	    if(todayDate.compareTo(expiryDate) < 0)                              //Provided Expiry date in backend is after todays date.
	    {
	    	String couponMsg = singleCouponMsg.get(0).getText();
			System.out.println(couponMsg);	
	    }
	    
	    else
	    {
	    	String couponMsg = couponErrorMsg.getText();                //Provided Expiry date in backend is before or equals todays date.
			System.out.println(couponMsg);
                     
	    }
	}
	
	public void applyMultipleCoupon(String coupon, String coupon1, int year, int month, int date ) throws ParseException
	{
		showcoupon.click();
		couponTxtBox.clear();
		couponTxtBox.sendKeys(coupon);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(3);
		couponTxtBox.clear();
		couponTxtBox.sendKeys(coupon1);
		WaitStatementLib.iSleep(1);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(3);
		LocalDate todayDate = LocalDate.now();
	    LocalDate expiryDate = LocalDate.of(year, month, date);
	    if(todayDate.compareTo(expiryDate) < 0)                                   //Provided Expiry date in backend is after todays date.
	    {
	    	String couponMsg1 = singleCouponMsg.get(0).getText();
			System.out.println(couponMsg1);
			String couponMsg2 = singleCouponMsg.get(1).getText();
			System.out.println(couponMsg2);     
	    }
	    
	    else
	    {
	    	String couponMsg = couponErrorMsg.getText();                            //Provided Expiry date in backend is before or equals todays date. 
			System.out.println(couponMsg);   
	    }
	    
	}
	
	public void applyIndividualCoupon(String coupon, String coupon1, int year, int month, int date ) throws ParseException
	{
		showcoupon.click();
		couponTxtBox.sendKeys(coupon);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(1);
		couponTxtBox.clear();
		couponTxtBox.sendKeys(coupon1);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(3);
		LocalDate todayDate = LocalDate.now();
	    LocalDate expiryDate = LocalDate.of(year, month, date);
	    if(todayDate.compareTo(expiryDate) < 0)                               //Provided Expiry date in backend is after todays date.
	    {
	    	String couponMsg1 = singleCouponMsg.get(0).getText();
			System.out.println(couponMsg1);
	    }
	    else
	    {
	    	String couponMsg = couponErrorMsg.getText();                           //Provided Expiry date in backend is before or equals todays date.
			System.out.println(couponMsg);   
	    }
	    
	}
	
	public void displayCouponSelected(WebDriver driver)
	{
		WaitStatementLib.iSleep(10);
		WebDriverCommonLib.elementDisplay("Coupon", xp3, driver);
		System.out.println(xp3.getText());
		WaitStatementLib.iSleep(3);
	}
	
	public void showPaymentSection(WebDriver driver)
	{
		WaitStatementLib.iSleep(5);		
		WebDriverCommonLib.elementDisplay("Payment Information Section", xp, driver);
		WaitStatementLib.iSleep(3);
	}
	
	public void terms()
	{
		WaitStatementLib.iSleep(4);		
		chkBox.click();
	}
	
	public void placeOrder()
	{
		WaitStatementLib.iSleep(6);
		order.click();
	}
	
}
