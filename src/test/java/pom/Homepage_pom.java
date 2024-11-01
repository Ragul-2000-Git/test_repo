package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage_pom extends parentpom {
	public Homepage_pom (WebDriver test)
	{
		super(test);
	}
	@FindBy(xpath="//input[@placeholder=\"Search Amazon.in\"]") WebElement search;
	
	public void parameter(String input)
	{
		search.sendKeys(input);
		search.submit();
	}
}
