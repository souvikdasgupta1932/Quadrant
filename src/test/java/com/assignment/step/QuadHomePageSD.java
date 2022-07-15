package com.assignment.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment.cucumber.Driverfactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class QuadHomePageSD extends Driverfactory {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	QuadHomePageSD frc;

	@Given("user is on the Login Page")
	public void user_is_on_the_Login_Page() {
		Assert.assertTrue(true);
	}

	@Given("the user enters {string}")
	public void the_user_enters(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("user clicks on im not robot check box")
	public void user_clicks_on_im_not_robot_check_box() {
		wait.until(ExpectedConditions
				.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@title,'reCAPTCHA')]")));
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-border")));
		element.click();
		driver.switchTo().parentFrame();
	}

	@Then("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
		driver.findElement(By.id("btn-login")).sendKeys(string);
	}

	@Then("user verify error mesage {string}")
	public void user_verify_error_mesage(String string) {
		WebElement ele = driver.findElement(By.xpath("//div//label[text()='Email or Password details do not match']"));
		Assert.assertTrue(ele.isDisplayed());
	}

}
