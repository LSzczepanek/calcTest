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
		when(calc.random())
	    .thenReturn(6)
	    .thenReturn(0)
	    .thenReturn(Integer.MAX_VALUE)
	    .thenReturn(2312);
	    
	}
	
	
	@Test
	public void testRandomValueIsInt(){
		Assert.assertEquals(Integer.class, calc.random());
	}
	
	
	@Test
	public void testRandomValueIsInLowRange(){
		
		Assert.assertEquals(0, calc.random());
	}
	
	@Test
	public void testRandomValueIsInHighRange(){
		
		Assert.assertEquals(Integer.MAX_VALUE, calc.random());
	}
	
	@Test
	public void testRandomIsRandom(){
		Assert.assertEquals(true, calc.random());
		
	}
}
