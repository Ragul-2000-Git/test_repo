package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class parentpom {
 WebDriver wb;
 public parentpom(WebDriver test)
 {
	 wb=test;
	 PageFactory.initElements(test, this);
 }
}
