import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCase3 {

	String str;
	StringRep newrep;
	@Before
	public void initTest()
	{
	newrep = new StringRep();
	 str = "";
	}
	
	@Test
	public void test() {
	str = "abcdca";
	//assertEquals("dcba",newrep.replace(str));
	assertEquals("DcBa",newrep.replace(str));
}
}
