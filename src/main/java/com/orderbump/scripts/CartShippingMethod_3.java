package com.orderbump.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.orderbump.generics.BaseLib;
import com.orderbump.generics.WebDriverCommonLib;
import com.orderbump.pageobjects.AeroCheckoutPage;
import com.orderbump.pageobjects.RulePanel;
import com.orderbump.pageobjects.WordPress;

public class CartShippingMethod_3 extends BaseLib
{
	@Test
	public void matchedAnyOf_LocalPickup_1()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_shipping_method");
		rp.selectOperator("any");
		rp.selectLocalPickupShippingMethod();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showShippingMethod(driver);
		acp.selectLocalPickup();
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("matchedAnyOf_LocalPickup_1"))
	public void matchedAnyOf_FreeShipping_2()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_shipping_method");
		rp.selectOperator("any");
		rp.deselectLocalPickupShippingMethod();
		rp.selectFreeShippingShippingMethod();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showShippingMethod(driver);
		acp.selectFreeShipping();
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("matchedAnyOf_FreeShipping_2"))
	public void matchedAnyOf_FlatRate_3()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_shipping_method");
		rp.selectOperator("any");
		rp.deselectFreeShippingShippingMethod();
		rp.selectFlatRateShippingMethod();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showShippingMethod(driver);
		acp.selectFlatRate();
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("matchedAnyOf_FlatRate_3"))
	public void matchesNoneOf_FlatRate_4()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_shipping_method");
		rp.selectOperator("none");
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showShippingMethod(driver);
		acp.selectFlatRate();
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("matchesNoneOf_FlatRate_4"))
	public void matchesNoneOf_FreeShipping_5()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_shipping_method");
		rp.selectOperator("none");
		rp.deselectFlatRateShippingMethod();
		rp.selectFreeShippingShippingMethod();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showShippingMethod(driver);
		acp.selectFreeShipping();
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("matchesNoneOf_FreeShipping_5"))
	public void matchesNoneOf_LocalPickup_6()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_shipping_method");
		rp.selectOperator("none");
		rp.deselectFreeShippingShippingMethod();
		rp.selectLocalPickupShippingMethod();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showShippingMethod(driver);
		acp.selectLocalPickup();
		acp.showPaymentSection(driver);
	}
		
}
