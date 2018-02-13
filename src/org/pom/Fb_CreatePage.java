package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fb_CreatePage {

	
	
	
	
	
	
	@FindBy(xpath="//h2[@class='uiHeaderTitle']")
	private WebElement imageCreatePage;

	public WebElement getImageCreatePage() {
		return imageCreatePage;
	}
	
	
	
	
}
