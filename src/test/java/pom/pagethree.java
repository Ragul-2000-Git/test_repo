package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagethree extends parentpom{
	public pagethree (WebDriver test)
	{
		super(test);
	}
	@FindBy(xpath="//input[@id=\"buy-now-button\"]") WebElement buy;
	@FindBy(xpath="//input[@id=\"ap_email\"]") WebElement number;
	@FindBy(xpath="//input[@id=\"continue\"]") WebElement continu;
	
	public void bynow()
	{
		buy.click();
	}
	public void num()
	{
		number.sendKeys("9080334110");
	}
	public void con()
	{
		continu.click();
	}
}
