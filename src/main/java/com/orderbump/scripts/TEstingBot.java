package com.orderbump.scripts;

import java.net.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TEstingBot 
{
	public static final String KEY = "52ab8e6e7dd2ef9284d96e315aa77535";
	  public static final String SECRET = "92152af2ec62389e0606b30a619f95cf";
	  public static final String URL = "http://" + KEY + ":" + SECRET + "@hub.testingbot.com/wd/hub";

	  public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "CHROME");
		caps.setCapability("version", "77");
		caps.setCapability("platform", "WIN10");
		caps.setCapability("name", "My First Test");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com/ncr");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("TestingBot");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();
	  }

}
