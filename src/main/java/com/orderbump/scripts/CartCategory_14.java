package com.orderbump.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.orderbump.generics.BaseLib;
import com.orderbump.generics.WaitStatementLib;
import com.orderbump.generics.WebDriverCommonLib;
import com.orderbump.pageobjects.AeroCheckoutPage;
import com.orderbump.pageobjects.ChoicePage;
import com.orderbump.pageobjects.RulePanel;
import com.orderbump.pageobjects.WordPress;

public class CartCategory_14 extends BaseLib
{
	@Test
	public void containsAtMost_1()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_category");
		rp.selectOperator("<");
		rp.applyquantity("2");
		rp.selectCartCategory();
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showPaymentSection(driver);
		acp.showProduct(driver);
		acp.selectSimpleSubscriptionProduct();
		acp.showWhatsIncluded(driver);
		acp.showPaymentSection(driver);
		acp.variableSubsProdsOptionsLink();
		
		WaitStatementLib.iSleep(2);
		ChoicePage cp=new ChoicePage(driver);
		cp.varSubsProdsChoices("Green");
		cp.clickOnUpdateOrSignUpNowForDedicated();
		
		WaitStatementLib.iSleep(1);
		acp.showPaymentSection(driver);
		
	}
	
	@Test(dependsOnMethods=("containsAtMost_1"))
	public void containsAtLeast_2()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_category");
		rp.selectOperator(">");
		rp.applyquantity("1");
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showPaymentSection(driver);
		acp.showProduct(driver);
		acp.selectSimpleSubscriptionProduct();
		acp.showWhatsIncluded(driver);
		acp.showPaymentSection(driver);
	}
	
	@Test(dependsOnMethods=("containsAtLeast_2"))
	public void containsExactly_3()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_category");
		rp.selectOperator("==");
		rp.applyquantity("2");
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showPaymentSection(driver);
		acp.showProduct(driver);
		acp.selectSimpleSubscriptionProduct();
		acp.showWhatsIncluded(driver);
		acp.showPaymentSection(driver);
		acp.variableSubsProdsOptionsLink();
		
		WaitStatementLib.iSleep(2);
		ChoicePage cp=new ChoicePage(driver);
		cp.varSubsProdsChoices("Green");
		cp.clickOnUpdateOrSignUpNowForDedicated();
		
		WaitStatementLib.iSleep(1);
		acp.showPaymentSection(driver);
	}
	
}
