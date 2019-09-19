package com.orderbump.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orderbump.generics.WaitStatementLib;
import com.orderbump.generics.WebDriverCommonLib;

public class RulePanel 
{
	@FindBy(xpath="//select[contains(@name,'[rule5d7f141e66a95][rule_type]')]")
	private WebElement ruleTypeDrpDwn;
	@FindBy(xpath="//select[contains(@name,'[rule5d7f141e66a95][operator]')]")
	private WebElement operatorDrpDwn;
	@FindBy(xpath="//input[contains(@name,'[rule5d7f141e66a95][condition][qty]')]")
	private WebElement quantity;
	@FindBy(xpath="//input[contains(@name,'[rule5d7f141e66a95][condition]')]")
	private WebElement conditionValue;
	
	@FindBy(xpath="//input[contains(@value,'Search')]")
	private WebElement searchBox;
	@FindBy(xpath="//a[@data-option-array-index='2']")
	private WebElement deselectLocalPickup;
	@FindBy(xpath="//a[@data-option-array-index='1']")
	private WebElement deselectFreeShipping;
	@FindBy(xpath="//a[@data-option-array-index='0']")
	private WebElement deselectFlatRate;
	
	@FindBy(xpath="//li[@data-option-array-index='0']")
	private WebElement belt;
	@FindBy(xpath="//li[@data-option-array-index='1']")
	private WebElement simpleSubs;
	@FindBy(xpath="//li[@data-option-array-index='2']")
	private WebElement variableSubs;
	
	@FindBy(xpath="//button[text()='Save Rules']")
	private WebElement saveRulesBtn;
	
	public RulePanel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectRuleType(String rule)
	{
		WaitStatementLib.iSleep(1);
		WebDriverCommonLib.selectOptionByValue(ruleTypeDrpDwn, rule);
	}
	
	public void selectOperator(String operatorType)
	{
		WaitStatementLib.iSleep(1);
		WebDriverCommonLib.selectOptionByValue(operatorDrpDwn, operatorType);
	}
	
	public void applyquantity(String value)
	{
		WaitStatementLib.iSleep(1);
		quantity.clear();
		quantity.sendKeys(value);
	}
	
	public void applyConditionValue(String value)
	{
		WaitStatementLib.iSleep(1);
		conditionValue.clear();
		conditionValue.sendKeys(value);
	}
	
	public void clickOnSaveRulesBtn()
	{
		WaitStatementLib.iSleep(1);
		saveRulesBtn.click();
		WaitStatementLib.iSleep(4);
	}
	
	public void selectFlatRateShippingMethod()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("flat rate"+Keys.ENTER);
	}
	
	public void selectFreeShippingShippingMethod()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("free shipping"+Keys.ENTER);
	}
	
	public void selectLocalPickupShippingMethod()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("local pickup"+Keys.ENTER);
	}
	
	public void deselectFlatRateShippingMethod()
	{
		WaitStatementLib.iSleep(2);
		deselectFlatRate.click();
	}
	
	public void deselectFreeShippingShippingMethod()
	{
		WaitStatementLib.iSleep(2);
		deselectFreeShipping.click();
	}
	
	public void deselectLocalPickupShippingMethod()
	{
		WaitStatementLib.iSleep(2);
		deselectLocalPickup.click();
	}
	
	public void selectDay()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("monday"+Keys.ENTER);
	}
	
	public void selectShippingOrBillingCountry()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("united kingdom"+Keys.ENTER+"united states"+Keys.ENTER);
	}
	
	public void selectCustomer()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("ritvik raj"+Keys.ENTER);
	}
	
	public void selectCustomerRole()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("administrator"+Keys.ENTER);
	}
	
	public void selectCoupons()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("provalid1"+Keys.ENTER+"provalid2"+Keys.ENTER);
	}
	
	public void selectCartItemType()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("simple"+Keys.ENTER+"subscription"+Keys.ENTER);
	}
	
	public void selectCartCategory()
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("accessories"+Keys.ENTER);
	}
	
	public void selectCartItem(WebDriver driver)
	{
		searchBox.clear();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("belt");
		WaitStatementLib.iSleep(2);
		belt.click();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("simple subscription");
		WaitStatementLib.iSleep(2);
		simpleSubs.click();
		WaitStatementLib.iSleep(2);
		searchBox.sendKeys("variable subscription");
		WaitStatementLib.iSleep(2);
		variableSubs.click();
		WaitStatementLib.iSleep(2);
	}
	
}
