package calcTest;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestSqrt {
	
	Calc calc;
	
	@Before
	public void setup(){
		calc = new Calc();
	}
	
	@Test
	public void testResultIsCorrect() throws Exception{
		Assert.assertEquals(Integer.valueOf(2), calc.sqrt(4));
	}
	
	
	@Test (expected = Exception.class) 
	public void testSqrtIsNotLessThanZero() throws Exception{
		Assert.assertSame(Exception.class, calc.sqrt(-10));
	}
	
	@Test
	public void testSqrtZeroIsZero() throws Exception{
		Assert.assertEquals(Integer.valueOf(0), calc.sqrt(0));
	}
	
	@Test
	public void testSqrtIsInteger() throws Exception{
		Assert.assertTrue(calc.sqrt(9.3) instanceof Integer);
	}
	
	
	@Test
	public void testSqrtRoundValueDown() throws Exception{
		Assert.assertEquals(Integer.valueOf(3), calc.sqrt(9.5));
	}

}
