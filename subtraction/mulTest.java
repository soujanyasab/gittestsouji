package ss;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class mulTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
   @Test
   public void testmul(){
	   mul mulobj=new mul(10,20,30);
	   Assert.assertEquals(9000, mulobj.mul());
   }
   
   
}
