package org.pom;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fb_Homepage extends Base {
	
	public Fb_Homepage(){
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
	private WebElement imageHomepage;
	
	@FindBy(name="email")
	private WebElement txtUsername;
	
	@FindBy(id="pass")
	private WebElement txtPasswrd;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(name="firstname")
	private WebElement txtFirstname;
	
	@FindBy(name="lastname")
	private WebElement txtLastname;
	
	@FindBy(name="reg_email__")
	private WebElement txtMoborEmail;
	
	@FindBy(name="reg_passwd__")
	private WebElement txtNewpasswrd;
	
	@FindBy(name="birthday_day")
	private WebElement ddBdyDay;
	
	
    @FindBy(name="birthday_month")
	private WebElement ddBdyMonth;
	
	@FindBy(name="birthday_year")
	private WebElement ddBdyYear;

	@FindBy(id="birthday-help")
	private WebElement lnkBdyHelp;
	
	@FindBy(linkText="Create a Page")
	private WebElement lnkCreatePage;
	
	@FindBy(name="sex")
	private List<WebElement> rbtnGender;

	@FindBy(name="websubmit")
	private WebElement btnCreateAccount;
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement txtRe_Email;
	
	@FindBy(xpath="//h3[text()=\"Confirm your date of birth\"]")
	private WebElement imageDateConfrmPopup;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement btnCnfrmDobYes;
	
	@FindBy(xpath="//b[text()='Providing your date of birth']")
    private WebElement imageDobAlertMess;
	
//	@FindBy(xpath="//a[text()='Create a Page']")
//	private WebElement lnkCreatePage;
	
	@FindBy(xpath="(//a[@role='button'])[10]")
	private WebElement btnDobAlert;
	
	

	public WebElement getImageDobAlertMess() {
		return imageDobAlertMess;
	}


	public WebElement getBtnDobAlert() {
		return btnDobAlert;
	}


	public WebElement getBtnCnfrmDobYes() {
		return btnCnfrmDobYes;
	}


	public WebElement getImageDateConfrmPopup() {
		return imageDateConfrmPopup;
	}


	public WebElement getTxtRe_Email() {
		return txtRe_Email;
	}

	
	public WebElement getImageHomepage() {
		return imageHomepage;
	}


	public WebElement getTxtUsername() {
		return txtUsername;
	}


	public WebElement getTxtPassname() {
		return txtPasswrd;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
	public WebElement getTxtPasswrd() {
		return txtPasswrd;
	}


	public WebElement getTxtFirstname() {
		return txtFirstname;
	}


	public WebElement getTxtLastname() {
		return txtLastname;
	}


	public WebElement getTxtMoborEmail() {
		return txtMoborEmail;
	}


	public WebElement getTxtNewpasswrd() {
		return txtNewpasswrd;
	}


	public WebElement getDdBdyDay() {
		return ddBdyDay;
	}


	public WebElement getDdBdyMonth() {
		return ddBdyMonth;
	}


	public WebElement getDdBdyYear() {
		return ddBdyYear;
	}

	
	public WebElement getLnkBdyHelp() {
		return lnkBdyHelp;
	}


	public List<WebElement> getRbtnGender() {
		return rbtnGender;
	}


	public WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}


	public WebElement getLnkCreatePage() {
		return lnkCreatePage;
	}



	
	
	
}
