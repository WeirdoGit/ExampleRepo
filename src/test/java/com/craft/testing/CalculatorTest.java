package com.craft.testing;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.craft.Calculator;


public class CalculatorTest {

	
	
Calculator c = new Calculator();
	@Test
	public void additionTest() {
	assertEquals(8, c.addition(3, 5));
		
	}
	
	@Test
public void divisionTest() {
		assertEquals(2, c.division(4, 2));
	}
  @Test
  public void multiplicationTest() {
		assertEquals(8, c.multiplication(4, 2));
  }
  @Test
  public void subtractionTest() {
		assertEquals(2, c.subtraction(4, 2));
	
  }
  
  @Test
  public void modulusTest() {
		assertEquals(0, c.modulus(4, 2));
	
  }
	
	

}
