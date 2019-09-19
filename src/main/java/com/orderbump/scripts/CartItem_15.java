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

public class CartItem_15 extends BaseLib
{
	@Test
	public void containsAtLeast_1()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_item");
		rp.selectOperator(">");
		rp.applyquantity("2");
		rp.selectCartItem(driver);
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
	
	@Test(dependsOnMethods=("containsAtLeast_1"))
	public void containsAtMost_2()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_item");
		rp.selectOperator("<");
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
	
	@Test(dependsOnMethods=("containsAtMost_2"))
	public void containsExactly_3()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_item");
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
	
	@Test(dependsOnMethods=("containsExactly_3"))
	public void doesNotContainsAtLeast_4()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_item");
		rp.selectOperator("!=");
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
