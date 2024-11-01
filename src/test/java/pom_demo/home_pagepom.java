package pom_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home_pagepom extends parent_const{
  public home_pagepom(WebDriver test)
  {
	  super (test);
  }
  @FindBy(xpath="//span[normalize-space()='My Account']") WebElement home;
  @FindBy (xpath="//a[text()=\"Register\"]") WebElement register;
  @FindBy(xpath="//a[text()=\"Login\"]") WebElement login;
  
  public void wb()
  {
	  home.click();
  }
  public void reg()
  {
	  register.click();
  }
  public void logi()
  {
	  login.click();
  }
  
}
