package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MXGOLDLogoPOM {
	private WebDriver driver; 
	
	public MXGOLDLogoPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn; 
	
	@FindBy(xpath="//img[@class='pack-logo']")
	private WebElement logo;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public void goToSubscriptionPage() {
		this.addFreeBtn.click();
        Assert.assertEquals("https://qqcdnpictest.mxplay.com/pic/249d77f5914b135e5aa3778b51ddb580/desktop_web/14x3/336x72/test_pic1672050671466.png",this.logo.getAttribute("src"), "MXGOLD logo is present");
	    
	}
	
//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
//	
//	public void clickLoginBtn() {
//		this.loginBtn.click(); 
//	}
}
