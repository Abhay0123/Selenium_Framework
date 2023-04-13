package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SeeLessPOM {
	private WebDriver driver; 
	
	public SeeLessPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//span[@class='f-see-more' and text()='..See More']")
	private WebElement seeMoreButton;
	
	@FindBy(xpath="//span[@class='f-see-more' and text()='..See Less']")
	private WebElement seeLessButton;
	
	public void seeLess() {
		
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
