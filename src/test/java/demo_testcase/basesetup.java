package demo_testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class basesetup {
	WebDriver test;
	Properties p;
	FileInputStream fi;
 @BeforeTest
 @Parameters({"browser","os"})
 public void setup(String br,String os) throws IOException
 {
	 if(p.getProperty("env").equals("remote"))
	 {
		 DesiredCapabilities cap=new DesiredCapabilities();
		 if(os.equals("windows"))
		 {
			 cap.setPlatform(Platform.WIN11);
		 }
		 switch(br)
		 {
		 case "chrome": cap.setBrowserName("chrome");break;
		 }
		 test=new RemoteWebDriver(new URL(" http://192.168.1.5:4444"),cap);
	 }
	 
	 if(p.getProperty("env").equals("local"))
	 {
		 switch(br)
		 {
		 case "chrome": test=new ChromeDriver ();break;
		 case"edge": test=new EdgeDriver();break;
		 }
	 }
	 
	 p=new Properties();
	 fi=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
	 p.load(fi); 
	 test.get(p.getProperty("url1"));
	 test.manage().window().maximize();
	 test.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 }
}
