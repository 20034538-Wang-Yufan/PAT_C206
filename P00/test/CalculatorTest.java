import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private int a,b;
	Calculator cal=new Calculator();

	@Before
	public void setUp() throws Exception {
		// arrange
		a=4321;
		b=1234;
		Calculator cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	public void testSubstract() {
		//act
	    int actual=cal.substract(a, b);
	    //assert
	    int expected=3087;
	    assertEquals(expected, actual);
	}
	public void testMultiple() {
		//act
	    int actual=cal.multiple(a, b);
	    //assert
	    int expected=5332114;
	    assertEquals(expected, actual);
	}
	public void testDivide() {
		//act
	    int actual=cal.divide(a, b);
	    //assert
	    int expected=3;
	    assertEquals(expected, actual);
	}
	

	}



