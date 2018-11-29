import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Array;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class SquareRootTest{

	SquareRoot squareroot; 
	
//	@Before
//	public void setUp() {
//		squareroot = new SquareRoot();
//	}
	
	@Test
	void testingOne() {
		SquareRoot squareroot = new SquareRoot();
		assertEquals(1.0, squareroot.squareRoot(1.0));
	}
	
	@Test
	void testingPerfectSquares() {
		SquareRoot squareroot = new SquareRoot();
		double[] test = {4.0, 16.0, 36.0};
		double[] expected = {2.0, 4.0, 6.0};
		for(int i = 0; i < test.length; i++)
		{
			assertTrue(Math.abs(expected[i] - squareroot.squareRoot(test[i])) <= 0.0001);
		}
		
	}
	
	@Test
	void testingIntegersNotSquares() {
		SquareRoot squareroot = new SquareRoot();
		double[] test = {5.0, 17.0, 37.0};
		double[] expected = {2.2360, 4.1231, 6.0827};
		for(int i = 0; i < test.length; i++)
		{
			assertTrue(Math.abs(expected[i] - squareroot.squareRoot(test[i])) <= 0.0001);
		}
		
	}
	
	@Test
	void testingFloats() {
		SquareRoot squareroot = new SquareRoot();
		double[] test = {5.5, 17.5, 37.5};
		double[] expected = {2.3452, 4.1833, 6.1237};
		for(int i = 0; i < test.length; i++)
		{
			assertTrue(Math.abs(expected[i] - squareroot.squareRoot(test[i])) <= 0.0001);
		}
		
	}
	
	@Test
	void testingNeverEndingNumbers() {
		SquareRoot squareroot = new SquareRoot();
		double[] test = {1.0/3.0, 1.0/6.0, 1.0/9.0};
		double[] expected = {0.5773, 0.4082, 0.3333};
		for(int i = 0; i < test.length; i++)
		{
			assertTrue(Math.abs(expected[i] - squareroot.squareRoot(test[i])) <= 0.0001);
		}
		
	}
	
	@Test
	void testingNegativeNumbers() {
		SquareRoot squareroot = new SquareRoot();
			assertThrows(IllegalArgumentException.class, () -> {
				squareroot.squareRoot(-5.0);
			});
			
	}
	
	@Test
	void testingZero() {
		SquareRoot squareroot = new SquareRoot();
		assertEquals(0, squareroot.squareRoot(0));
	}
	
	@Test
	void testingNegativeZero() {
		SquareRoot squareroot = new SquareRoot();
		assertEquals(0, squareroot.squareRoot(-0));
	}
	
	@Test
	public void SquareRootForDoubleMax(){
		SquareRoot squareroot = new SquareRoot();
		assertTrue((70001.000 - squareroot.squareRoot(Double.MAX_VALUE)) <= 0.0001);
	}
	
	
	

	
	
	
	
	
	
	
}
