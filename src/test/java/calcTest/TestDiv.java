package calcTest;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class TestDiv {

	Calc calc;

	@Before
	public void before() {
		calc = new Calc();
	}

	@Test
	public void testDiv() {
		int a = 8;
		int b = 2;
		try {
			Assert.assertEquals(4, calc.div(a, b));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test (expected = Exception.class) 
	public void testDiv0() throws Exception{
		int a = 8;
		int b = 0;
		
		Assert.assertEquals(Exception.class, calc.div(a,b));
		
	}

	@Test
	public void testDivDzielnikWiekszy() throws Exception {
		int a = 2;
		int b = 4;

		Assert.assertEquals(0, calc.div(a, b));

	}

}
