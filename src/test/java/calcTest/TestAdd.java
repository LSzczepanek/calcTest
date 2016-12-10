package calcTest;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestAdd {
	
	Calc calc;

	@Before
	public void before(){
		calc = new Calc();
	}
	
	
	@Test
	public void testAdd() {
		
		int a = 2;
		int b = 3;
		Assert.assertEquals(5, calc.add(a,b));
		

	}
	
}
