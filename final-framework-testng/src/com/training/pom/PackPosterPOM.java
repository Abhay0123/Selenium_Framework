package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PackPosterPOM {
	private WebDriver driver; 
	
	public PackPosterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn; 
	
	@FindBy(xpath="//img[@class='pack-poster']")
	private WebElement packPosterLogo;
	
//	@FindBy(id="formLogin_submitAuth")
//	private WebElement loginBtn; 
	
	public void subscriptionPosterInfo() {
		this.addFreeBtn.click();
        Assert.assertEquals("https://qqcdnpictest.mxplay.com/pic/249d77f5914b135e5aa3778b51ddb580/desktop_web/14x13/560x520/test_pic1673332901807.jpg",this.packPosterLogo.getAttribute("src"), "Subscription pack poster is present");
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
