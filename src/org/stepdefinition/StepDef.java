package org.stepdefinition;


import java.util.List;
import java.util.Map;

import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	
	
	
    @Given("^User is on Home Page$")
    public  void browserLaunch() {
	Base b = new Base();
	b.getDriver("http://toolsqa.com/automation-practice-form/");
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

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String fname, String lname) throws Exception {
		Base b = new Base();
		WebElement firstname = b.driver.findElement(By.name("firstname"));
		WebElement lastname = b.driver.findElement(By.name("lastname"));
		b.setText(firstname, fname);
		b.setText(lastname, lname);
	}

	@Then("^verify the entered \"([^\"]*)\" and\"([^\"]*)\"$")
	public void verify_the_entered_and(String fname, String lname) throws Exception {
        Base b = new Base();
		WebElement firstname = b.driver.findElement(By.name("firstname"));
		WebElement lastname = b.driver.findElement(By.name("lastname"));
		Assert.assertEquals(fname, b.getAttributeValue(firstname));
		Assert.assertEquals(lname, b.getAttributeValue(lastname));
		b.closeApp(b.driver);

	}
	
	@When("^Enter_Firstname and Lastname$")
	public void enter_firstname_and_Lastname(DataTable testdata) throws Exception {
		Base b = new Base();
		List<Map<String, String>> data = (List<Map<String, String>>) testdata.asMap(String.class,String.class);
		
		WebElement firstname = b.driver.findElement(By.name("firstname"));
		WebElement lastname = b.driver.findElement(By.name("lastname"));
		b.setText(firstname, data.get(0).get(0));
		b.setText(lastname, data.get(0).get(1));

		
	}

	@Then("^verify Firstname and Lastname$")
	public void verify_Firstname_and_Lastname() throws Exception {
		Base b = new Base();
		b.closeApp(b.driver);
		
		
	}

	@When("^Enter the Country$")
	public void enter_the_Country(DataTable testData) throws Exception {
		Base b = new Base();
		List<List<String>> data = testData.asLists(String.class);
		WebElement countyName=b.driver.findElement(By.id("dropdown_7"));
		b.dd_SelectbyVisible(countyName, data.get(0).get(1));
		
	}
	
	@Given("^User is on demoqa home Page$")
	public void user_is_on_demoqa_home_Page() throws Exception {
	  Base b = new Base();
	  b.getDriver("http://demoqa.com/registration/");
	}

	@Then("^verify the country$")
	public void verify_the_country() throws Exception {
	   Base b = new Base();
		WebElement countyName=b.driver.findElement(By.id("dropdown_7"));
		Select s = new Select(countyName);
		String str = s.getFirstSelectedOption().getText();
		Assert.assertEquals("india", s.getFirstSelectedOption().getText());

	}

	
	
	
}
