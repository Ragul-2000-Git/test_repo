package demo_testcase;

import org.testng.annotations.Test;

import pom_demo.home_pagepom;


public class test1 extends basesetup {
  @Test(groups={"sanity"})
  public void f() {
	  home_pagepom hp=new home_pagepom(test);
	  hp.wb();
hp.logi();	  
	  
  }
}
