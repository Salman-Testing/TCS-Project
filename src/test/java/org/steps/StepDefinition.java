package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User will launch browser and hit the URL")
	public void user_will_launch_browser_and_hit_the_URL() {
	    launchChromeBrowser();
	    urlLaunch("https://en-gb.facebook.com/");
	}

	@When("User will enter the UserId and Password in the respective field")
	public void user_will_enter_the_UserId_and_Password_in_the_respective_field() {
	    driver.findElement(By.name("email")).sendKeys("Selenium");
	    driver.findElement(By.name("pass")).sendKeys("Selenium@12354");
	}

	@When("User will click the login button")
	public void user_will_click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

}
