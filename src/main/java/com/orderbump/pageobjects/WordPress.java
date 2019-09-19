package com.orderbump.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orderbump.generics.WaitStatementLib;

public class WordPress 
{
	@FindBy(id="user_login")
	private WebElement username;
	@FindBy(id="user_pass")
	private WebElement password;
	@FindBy(id="wp-submit")
	private WebElement logInBtn;
	
	@FindBy(xpath="//div[text()='WooFunnels']")
	private WebElement woofunnels;
	@FindBy(xpath="//a[text()='AeroCheckout']")
	private WebElement aeroCheckout;
	@FindBy(xpath="//a[text()='OrderBump']")
	private WebElement orderBump;
	
	@FindBy(id="wfacp-search-input")
	private WebElement searchBox;
	@FindBy(id="search-submit")
	private WebElement searchBtn;
	
	@FindBy(id="save")
	private WebElement publishBtn;
	@FindBy(className="customize-controls-close")
	private WebElement closeCustomizerSettings;
	@FindBy(xpath="//a[@class='wfacp-preview']")
	private WebElement checkoutPageLink;
	
	@FindBy(linkText="rule panel (#2454)")
	private WebElement rulePanel;
	
	
	public WordPress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void wordPressLogin()
	{
		WaitStatementLib.iSleep(1);
		username.sendKeys("admin");
		password.sendKeys("admin");
		logInBtn.click();
	}
	
	public void clickOnAeroCheckout(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		act.click(aeroCheckout).perform();
	}
	
	public void searchForCheckoutPage(String checkoutPageId, WebDriver driver)
	{
		searchBox.clear();
		searchBox.sendKeys(checkoutPageId);
		searchBtn.click();
	}
	
	public void checkoutPageProductsMenu(String checkoutPageId, WebDriver driver)
	{
		driver.findElement(By.xpath("//a[contains(text(),'#"+checkoutPageId+"')]/../../../..//span/a[text()='Products']")).click();
		WaitStatementLib.iSleep(3);
	}
	
	public void viewCheckoutPage() 
	{
		WaitStatementLib.iSleep(2);
		publishBtn.click();
		WaitStatementLib.iSleep(3);
		closeCustomizerSettings.click();
		WaitStatementLib.iSleep(5);
		checkoutPageLink.click();
	}
	
	public void clickOnOrderBump(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		act.click(orderBump).perform();
	}
	
	public void clickOnRulePanelinOrderBump()
	{
		WaitStatementLib.iSleep(1);
		rulePanel.click();
	}
	
	
	

}
