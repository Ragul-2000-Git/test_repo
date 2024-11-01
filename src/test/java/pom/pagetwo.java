package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagetwo extends parentpom {
	public pagetwo (WebDriver test)
	{
		super(test);
	}
	@FindBy(xpath="//span[text()='2XL']") WebElement filterone;
	@FindBy(xpath="//li[@id=\"p_n_feature_nineteen_browse-bin/11301357031\"]//label//i[@class=\"a-icon a-icon-checkbox\"]") WebElement fitertwo;
	@FindBy(xpath="//li[@id=\"p_123/398346\"]//i[@class=\"a-icon a-icon-checkbox\"]") WebElement filterthree;
	@FindBy(xpath="//span[text()='485']") WebElement selection;
	
	public void filone()
	{
		filterone.click();
	}
	public void filtwo()
	{
		fitertwo.click();
	}
	public void filthree()
	{
		filterthree.click();
	}
	public void sel()
	{
		selection.click();
	}
}
