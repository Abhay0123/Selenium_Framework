package com.training.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomeButtonPOM {
	private WebDriver driver; 
	
	public HomeButtonPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//span[@class='link-span']")
	private WebElement Home;
	
	
	public void homeButtonValidation() {
		
		this.addFreeBtn.click();
        String url1 = driver.getCurrentUrl();
        System.out.println(url1);
        this.Home.click();
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        if(url1.equals(url2)) {
			System.out.println("Redirect to home page not done");
		}else {
		    System.out.println("Redirect to home page done, Home button validation done");
		}
		    
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
