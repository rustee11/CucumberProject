package org.stepdefinition;

import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	
	
	
    @Given("^User is on Home Page$")
    public  void browserLaunch() {
	Base b = new Base();
	b.getDriver("http://toolsqa.com/automation-practice-form/");
      }
	
	@When("^Enter_Firstname and Lastname$")
	public static void userName() {
		Base b = new Base();
		WebElement firstname = b.driver.findElement(By.name("firstname"));
		WebElement lastname = b.driver.findElement(By.name("lastname"));
		b.setText(firstname, "vinoth");
		b.setText(lastname, "rustee");
	}
	
	
	@Then("^Logout the browser$")
	public void logout() {
		Base b = new Base();
		b.closeApp(b.driver);
	}
	
	@Then("^verify and Logout the browser$")
	public void verify_and_Logout_the_browser() throws Exception {
		Base b = new Base();
		WebElement firstname = b.driver.findElement(By.name("firstname"));
		WebElement lastname = b.driver.findElement(By.name("lastname"));
		Assert.assertEquals("vinoth", b.getAttributeValue(firstname));
		Assert.assertEquals("rustee", b.getAttributeValue(lastname));
		b.closeApp(b.driver);

	}

	
	
	
	
	
	
	
	
	
}
