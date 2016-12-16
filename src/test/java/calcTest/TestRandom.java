package calcTest;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.mockito.Mock;




import junit.framework.Assert;

public class TestRandom {

	@Mock
	Calc calc;

	@Before
	public void before(){
		initMocks(this);

	    
	}
	
	
	@Test
	public void testRandomValueIsInt(){
		Calc calc = new Calc();
		Assert.assertTrue(calc.random() instanceof Integer);
	}
	
	
	@Test
	public void testRandomValueIsInLowRange(){
		when(calc.random()).thenReturn(0);
		Assert.assertSame(Integer.valueOf(0) , calc.random());
	}
	
	@Test
	public void testRandomValueIsInHighRange(){
		when(calc.random()).thenReturn(Integer.MAX_VALUE);
		Assert.assertEquals(Integer.valueOf(Integer.MAX_VALUE), calc.random());
	}
	
	
}
