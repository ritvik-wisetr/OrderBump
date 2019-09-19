package com.orderbump.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.orderbump.generics.WaitStatementLib;
import com.orderbump.generics.WebDriverCommonLib;

public class ChoicePage 
{
	@FindBy(xpath="//select[@id='pa_color']")
	private WebElement drpDwn1;
	
	@FindBy(xpath="//select[@id='logo']")
	private WebElement drpDwn2;
	
	@FindBy(xpath="//p[text()='This is a variable product.']")
	private WebElement description;
	
	@FindBy(xpath="//p[text()='Out of stock']")
	private WebElement outOfStock;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement cartBtn;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement updateBtn;
	
	@FindBy(name="wfacp_update")
	private WebElement updateOrSignUpBtn;
	
	@FindBy(xpath="//button[contains(@class,'single_add_to_cart_button')]")
	private WebElement signUpNowBtn;
	
	public ChoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void choices(WebDriver driver, String color, String logo)
	{
		WebDriverCommonLib.selectOptionByText(drpDwn1, color);
		WebDriverCommonLib.selectOptionByText(drpDwn2, logo);
		
		WaitStatementLib.iSleep(2);
		WebDriverCommonLib.elementDisplay("message", description, driver);	
	}
	
	public void clickOnAddToCartBtn()
	{
		cartBtn.click();
	}
	
	public void clickOnUpdateBtn()
	{
		updateBtn.click();
	}
	
	public void varSubsProdsChoices(String color)
	{
		WebDriverCommonLib.selectOptionByText(drpDwn1, color);
	}
	
	public void clickOnUpdateOrSignUpNowForDedicated()
	{
		updateOrSignUpBtn.click();
	}
	
	public void clickOnSignUpNowForGlobal()
	{
		signUpNowBtn.click();
	}

}
