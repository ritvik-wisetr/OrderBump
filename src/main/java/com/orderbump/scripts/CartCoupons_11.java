package com.orderbump.scripts;

import java.text.ParseException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.orderbump.generics.BaseLib;
import com.orderbump.generics.WaitStatementLib;
import com.orderbump.generics.WebDriverCommonLib;
import com.orderbump.pageobjects.AeroCheckoutPage;
import com.orderbump.pageobjects.RulePanel;
import com.orderbump.pageobjects.WordPress;

public class CartCoupons_11 extends BaseLib
{
	@Test
	public void matchedAnyOf_1()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_coupons");
		rp.selectOperator("any");
		rp.selectCoupons();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showPaymentSection(driver);
		WaitStatementLib.iSleep(5);
		acp.couponApply("provalid1");
		WaitStatementLib.iSleep(3);
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("matchedAnyOf_1"))
	public void matchesAllOf_2() throws ParseException
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_coupons");
		rp.selectOperator("all");
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showPaymentSection(driver);
		WaitStatementLib.iSleep(5);
		acp.applySingleCoupon("provalid2", 2022, 10, 05);
		WaitStatementLib.iSleep(3);
		acp.showPaymentSection(driver);
	}
	
}
