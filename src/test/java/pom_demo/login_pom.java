package pom_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pom  extends parent_const{

	public login_pom(WebDriver test)
	{
		super(test);
		
	}
	@FindBy(xpath="//input[@id=\"input-email\"]") WebElement uss;
	@FindBy(xpath="//input[@id=\"input-password\"]")WebElement pass;
	@FindBy(xpath="//input[@class=\"btn btn-primary\"]") WebElement but;
	
	public void us(String a)
	{
		uss.sendKeys(a);
	}
	public void pas(String p)
	{
		pass.sendKeys(p);
	}
	public void bt()
	{
		but.click();
	}

}
