package testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
public class Baseclass {
	WebDriver test;
@BeforeClass
void setup()
{
	test=new ChromeDriver();
	test.get("https://www.amazon.in/");
	test.manage().window().maximize();
	test.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
  
}
