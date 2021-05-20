package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;

	public static void launchChromeBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}
	
	public static void urlLaunch(String urlName) {
		
		driver.get(urlName);

	}
	
	public static void fillTxt(WebElement textRef, String text) {
		
		textRef.sendKeys(text);

	}
	
	public static void loginBtnClick(WebElement btnRef) {
		
		btnRef.click();

	}
	
	public static void movingElement(WebElement target) {
		
		a = new Actions(driver);
		
		a.moveToElement(target).perform();
		
	}
	
	public static void draggingElement(WebElement source,WebElement target) {
		
		a = new Actions(driver);
		
		a.dragAndDrop(source, target).perform();

	}
	
	public static void refreshingPage() {
		driver.navigate().refresh();

	}

}
