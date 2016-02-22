/** This class contains JUnit test cases for the Calculator class
 * 
 * @author Peter K., Pin:421
 * @version 2/22/16
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
		fail("Not yet implemented");
	}
	

	

}
