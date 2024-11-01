package testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import pom.Homepage_pom;
import pom.pagethree;
import pom.pagetwo;

public class tc_1  extends Baseclass
{
	
	@Test
	void test()
	{
	Homepage_pom ss=new Homepage_pom(test);
ss.parameter("t-shirts");

pagetwo tw=new pagetwo(test);
tw.filone();
tw.filtwo();
tw.filthree();
tw.sel();
 Set<String> ids=test.getWindowHandles();
 List<String> id=new ArrayList(ids);
 test.switchTo().window(id.get(1));
 pagethree tp=new pagethree(test);
 tp.bynow();
 tp.num();
 tp.con();
 
}
}