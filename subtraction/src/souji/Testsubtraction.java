package souji;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Testsubtraction {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testsub()
	{
		sub subobj=new sub(100,50);
		Assert.assertEquals(50, subobj.sub());
	}

}



