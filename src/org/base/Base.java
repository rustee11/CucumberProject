package org.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sql.Sql_UserInput;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

public class Base {

	public static WebDriver driver;
	
	
	
	public  List<Sql_UserInput> userInput() throws Throwable{
		Sql_UserInput sql = new Sql_UserInput();
		List<Sql_UserInput> userInput = sql.userInputdata();
      return userInput;
	}
	
	public WebDriver getDriver(String url){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\FaceBookDuplicate\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
public void setText(WebElement ele,String str) {
	if(ele.isEnabled()&& ele.isDisplayed()) {
	ele.clear();
	ele.sendKeys(str);
	}else {System.out.println("Field issue");}
}	

public void btnClick(WebElement ele) {
	if(ele.isEnabled()&& ele.isDisplayed()) {
	ele.click();
	}else {System.out.println("Field issue");}
}	
	
public void rd_btnClick(List<WebElement> ele,int index) {
	List<WebElement> emp = ele;
	if(!emp.isEmpty()) {
	emp.get(index).click();}else {System.out.println("Empty");}
}
	
public void chkbox_btnClick(List<WebElement> ele,int index) {
	List<WebElement> emp = ele;
	if(!emp.isEmpty()) {
	emp.get(index).click();}else {System.out.println("Empty");}
}	

public void dd_SelectbyVisible(WebElement ele,String str) {
	Select s = new Select(ele);
	s.selectByVisibleText(str);
}

public void dd_SelectbyValue(WebElement ele,String value) {
	Select s = new Select(ele);
	s.selectByValue(value);
}

public void dd_Selectbyindex(WebElement ele,int index) {
	Select s = new Select(ele);
	s.selectByIndex(index);
}

public void screenshot(String name) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File srcFile = tk.getScreenshotAs(OutputType.FILE);
	File destFile = new File("C:\\Users\\Admin\\Desktop\\screenshot\\"+name+".png");
	FileUtils.copyFile(srcFile, destFile);
}

public void fullscreenshot(String name) throws Throwable {
	Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
	ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\Admin\\Desktop\\screenshot\\"+name+".png"));	        

}

public void scroll(WebElement ele,Boolean bool) {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("argument[0].ScrollIntoView("+bool+")", ele);
}


public String getText(WebElement ele) {
	
	String str =ele.getText();
	return str;
}


public void Await(WebElement ele,int sec) {
	
	WebDriverWait wait = new WebDriverWait(driver,sec);
	wait.until(ExpectedConditions.visibilityOf(ele));
	}

public void mouseClick(WebElement ele) {
	
	Actions acc = new Actions(driver);
	acc.moveToElement(ele).click().build().perform();
}

public void closeApp(WebDriver driver) {
	driver.close();
}


}
