package demo_testcase;

import org.testng.annotations.Test;

import pom_demo.home_pagepom;
import pom_demo.login_pom;

public class test2  extends basesetup

{
  @Test(groups= {"regression"})
  public void  f() 
  {
	  home_pagepom hp=new home_pagepom(test);
	  hp.wb();
	  hp.logi();
	  login_pom ln=new login_pom(test);
	  ln.us(p.getProperty("username"));
	  ln.pas(p.getProperty("passwors"));
	  ln.bt();
  }
}
