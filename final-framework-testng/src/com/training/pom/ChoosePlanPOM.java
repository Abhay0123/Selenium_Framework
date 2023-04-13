package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChoosePlanPOM {
	private WebDriver driver; 
	
	public ChoosePlanPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//div[@class='action-header']")
	private WebElement choosePlan;
	
	
	public void chooseThePlan() {
		
		this.addFreeBtn.click();
        Assert.assertEquals("Choose Plan",this.choosePlan.getText(), "choose plan Text is verified");
        System.out.println("Confirmation message:"+this.choosePlan.getText());
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
