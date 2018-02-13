package org.pom;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_UserMainpage extends Base{

	
	public Fb_UserMainpage(){
		PageFactory.initElements(driver,this);
	}
	
		 
	@FindBy(xpath="//div[text()='Rus Tee']")
	private WebElement imagetxtUserprof;


	@FindBy(xpath="//div[text()='Account Settings']")
	private WebElement arrowUsernavigate;
	
	
	@FindBy(xpath="(//span[@class='_54nh'])[12]")
	private WebElement btnLogout;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement btnHome;
	
	
	
	
	public WebElement getImagetxtUserprof() {
		return imagetxtUserprof;
	}

	public WebElement getBtnlogout() {
		return btnLogout;
	}

	public WebElement getArrowUsernavigate() {
		return arrowUsernavigate;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public WebElement getBtnHome() {
		return btnHome;
	}



	
	
	
	
	
	
	
	
}
