/** This class contains JUnit test cases for the Calculator class
 * 
 * @author Peter K., Pin:421
 * @version 2/22/16
 * GitHub URL: https://github.com/Paramity/cse360
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class CalculatorTest {
	
	/**
	 * Test to ensure that Calculator's Constructor is working properly, and that objects are successfully instantiated
	 */
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);		
	}
	
	/**
	 * Test to ensure that Calculator's getTotal method is working properly
	 */
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
	}
	
	/**
	 * Test to ensure that Calculator's add method is working properly
	 */
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
		
		calc.add(0);
		assertEquals(0,calc.getTotal());
		
		calc.add(1);
		assertEquals(1,calc.getTotal());
		
		calc.add(-1);
		assertEquals(0,calc.getTotal());
		
		calc.add(9999);
		assertEquals(9999,calc.getTotal());
		
		calc.add(1);
		assertEquals(10000,calc.getTotal());
		
		calc.add(-10000);
		assertEquals(0,calc.getTotal());
	}
	
	/**
	 * Test to ensure that Calculator's divide method is working properly
	 */
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
		
		calc.add(100);
		calc.divide(5);
		assertEquals(20,calc.getTotal());
		
		calc.divide(2);
		assertEquals(10,calc.getTotal());
		
		calc.divide(0);
		assertEquals(0,calc.getTotal());
		
		calc.subtract(100);
		calc.divide(20);
		assertEquals(-5,calc.getTotal());
		
		calc.divide(0);
		assertEquals(0,calc.getTotal());

		calc.divide(-1000);
		assertEquals(0,calc.getTotal());
		
		calc.divide(1000);
		assertEquals(0,calc.getTotal());
		
		calc.subtract(500);
		calc.divide(-50);
		assertEquals(10,calc.getTotal());
	}
	
	/**
	 * Test to ensure that Calculator's multiply method is working properly
	 */
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
		
		calc.multiply(1000);
		assertEquals(0,calc.getTotal());
		
		calc.multiply(-1000);
		assertEquals(0,calc.getTotal());
		
		calc.add(1);
		calc.multiply(100);
		assertEquals(100,calc.getTotal());
		
		calc.multiply(2);
		assertEquals(200,calc.getTotal());
		
		calc.multiply(-3);
		assertEquals(-600,calc.getTotal());
		
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
		
		calc.add(2);
		calc.multiply(10000);
		assertEquals(20000,calc.getTotal());
		
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
		
		calc.add(2);
		calc.multiply(-10000);
		assertEquals(-20000,calc.getTotal());
		
		calc.multiply(0);
		assertEquals(0,calc.getTotal());
		
		calc.subtract(2);
		calc.multiply(-10000);
		assertEquals(20000,calc.getTotal());
	}
	
	/**
	 * Test to ensure that Calculator's subtract method is working properly
	 */
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
		
		calc.subtract(0);
		assertEquals(0,calc.getTotal());
		
		calc.subtract(1);
		assertEquals(-1,calc.getTotal());
		
		calc.subtract(-1);
		assertEquals(0,calc.getTotal());
		
		calc.subtract(9999);
		assertEquals(-9999,calc.getTotal());
		
		calc.subtract(1);
		assertEquals(-10000,calc.getTotal());
		
		calc.subtract(-10000);
		assertEquals(0,calc.getTotal());
	}
	
	/**
	 * Test to ensure that Calculator's getHistory method is working properly
	 */
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		assertEquals("0",calc.getHistory());
		
		calc.add(5);
		assertEquals("0 + 5",calc.getHistory());
		
		calc.multiply(5);
		assertEquals("0 + 5 * 5",calc.getHistory());

		calc.subtract(5);
		assertEquals("0 + 5 * 5 - 5",calc.getHistory());

		calc.divide(5);
		assertEquals("0 + 5 * 5 - 5 / 5",calc.getHistory());
		
		Calculator calc2 = new Calculator();
		assertEquals("0",calc2.getHistory());
		
		calc2.add(-5);
		assertEquals("0 + -5",calc2.getHistory());
		
		calc2.multiply(-5);
		assertEquals("0 + -5 * -5",calc2.getHistory());

		calc2.subtract(-5);
		assertEquals("0 + -5 * -5 - -5",calc2.getHistory());

		calc2.divide(-5);
		assertEquals("0 + -5 * -5 - -5 / -5",calc2.getHistory());
		
		Calculator calc3 = new Calculator();
		assertEquals("0",calc3.getHistory());
		
		//test everything, adding/subtracting/dividing (also by 0)/multiplying by positive and negative numbers
		calc3.add(9000);
		calc3.add(-9000);
		calc3.subtract(9000);
		calc3.subtract(-9000);
		calc3.multiply(9000);
		calc3.multiply(-9000);
		calc3.divide(9000);
		calc3.divide(-9000);
		calc3.divide(0);

		assertEquals("0 + 9000 + -9000 - 9000 - -9000 * 9000 * -9000 / 9000 / -9000 / 0",calc3.getHistory());

	}
	

	

}
