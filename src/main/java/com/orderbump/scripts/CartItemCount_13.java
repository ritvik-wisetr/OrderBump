package com.orderbump.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.orderbump.pageobjects.ChoicePage;
import com.orderbump.generics.BaseLib;
import com.orderbump.generics.WaitStatementLib;
import com.orderbump.generics.WebDriverCommonLib;
import com.orderbump.pageobjects.AeroCheckoutPage;
import com.orderbump.pageobjects.RulePanel;
import com.orderbump.pageobjects.WordPress;

public class CartItemCount_13 extends BaseLib
{
//	@Test
//	public void isEqualTo_1()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator("==");
//		rp.applyConditionValue("1");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isNotEqualTo_2()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator("!=");
//		rp.applyConditionValue("1");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isGreaterThan_ValidCase_3()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator(">");
//		rp.applyConditionValue("1");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.selectSimpleSubscriptionProduct();
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isGreaterThan_InvalidCase_4()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator(">");
//		rp.applyConditionValue("1");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isLessThan_ValidCase_5()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator("<");
//		rp.applyConditionValue("2");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isLessThan_InvalidCase_6()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator("<");
//		rp.applyConditionValue("2");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.selectSimpleSubscriptionProduct();	
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isGreaterThanOrEqualTo_ValidCase_7()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator(">=");
//		rp.applyConditionValue("2");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.selectSimpleSubscriptionProduct();
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//	
//	@Test
//	public void isGreaterThanOrEqualTo_InvalidCase_8()
//	{
//		WordPress wp=new WordPress(driver);
//		wp.wordPressLogin();
//		wp.clickOnOrderBump(driver);
//		wp.clickOnRulePanelinOrderBump();
//		
//		RulePanel rp=new RulePanel(driver);
//		rp.selectRuleType("cart_item_count");
//		rp.selectOperator(">=");
//		rp.applyConditionValue("2");
//		rp.clickOnSaveRulesBtn();
//		
//		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.showProduct(driver);
//		acp.showWhatsIncluded(driver);
//		acp.showPaymentSection(driver);
//	}
//
	@Test
	public void isLessThanOrEqualTo_ValidCase_9()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_item_count");
		rp.selectOperator("<=");
		rp.applyConditionValue("2");
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showProduct(driver);
		acp.selectSimpleSubscriptionProduct();
		acp.showWhatsIncluded(driver);
		acp.showPaymentSection(driver);
	}
	
	@Test
	public void isLessThanOrEqualTo_InvalidCase_10()
	{
		WordPress wp=new WordPress(driver);
		wp.wordPressLogin();
		wp.clickOnOrderBump(driver);
		wp.clickOnRulePanelinOrderBump();
		
		RulePanel rp=new RulePanel(driver);
		rp.selectRuleType("cart_item_count");
		rp.selectOperator("<=");
		rp.applyConditionValue("2");
		rp.clickOnSaveRulesBtn();
		
		((JavascriptExecutor)driver).executeScript("window.open('http://localhost/testsite1/checkouts/orderbump/','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.showProduct(driver);
		acp.optionsLink();
		
		ChoicePage cp=new ChoicePage(driver);
		cp.choices(driver, "Red", "No");
		cp.clickOnUpdateBtn();
		
		WaitStatementLib.iSleep(1);
		acp.selectSimpleSubscriptionProduct();
		acp.showWhatsIncluded(driver);
		acp.showPaymentSection(driver);
	}
}
