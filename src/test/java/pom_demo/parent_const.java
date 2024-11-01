package pom_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class parent_const {
WebDriver wb;
public parent_const(WebDriver test)
{
	wb=test;
	PageFactory.initElements(test, this);
}
}
