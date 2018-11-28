import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class SquareRootTest{

	SquareRoot squareroot; 
	
//	@Before
//	public void setUp() {
//		squareroot = new SquareRoot();
//	}
//	
	@Test
	void test() {
		SquareRoot squareroot = new SquareRoot();
		assertEquals(1.0, squareroot.squareRoot(1.0));
	}
	
	@Test
	void test2() {
		SquareRoot squareroot = new SquareRoot();
		assertEquals(2.0, squareroot.squareRoot(4.0));
	}
	
	
	
	
}
