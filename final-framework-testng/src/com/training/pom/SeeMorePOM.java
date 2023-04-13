package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SeeMorePOM {
	private WebDriver driver; 
	
	public SeeMorePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//span[@class='f-see-more']")
	private WebElement seeMoreButton;
	
	@FindBy(xpath="//span[@class='f-see-more']")
	private WebElement seeLessButton;
	
	@FindBy(xpath="//li[@class='f-see-more']")
	private WebElement seeMoreText;
	
	public void seeMore() {
		this.addFreeBtn.click();
        this.seeMoreButton.click();
        this.seeLessButton.click();
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
