package ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.RecursiveFunctions;

class RecursiveFunctionsTest{

	
	
	@Test
	void factorialTest1() {
		int factorial = 4;
		int expected = 1;
			for(int j = factorial; j >= 1; j--) {
				expected *= j;
			}
			long tryme =RecursiveFunctions.factorial(factorial);
			assertTrue(expected == tryme, "Wrong number");
		
	}
	
	@Test
	void factorialTest2() {
		int factorial = 10;
		int expected = 1;
			for(int j = factorial; j >= 1; j--) {
				expected *= j;
			}
			long tryme =RecursiveFunctions.factorial(factorial);
			assertTrue(expected == tryme, "Wrong number");
		
	}
	
	@Test
	void factorialTest3() {
		int factorial = 20;
		int expected = 1;
			for(int j = factorial; j >= 1; j--) {
				expected *= j;
			}
			long tryme =RecursiveFunctions.factorial(factorial);
			assertTrue(expected == tryme, "Wrong number");
		
	}
	
	@Test
	void fibonacciTest1() {
		long test= 8;
		assertTrue(test == RecursiveFunctions.fibonacci(6), "Wrong fibonacci number");
	}
	
	@Test
	void fibonacciTest2() {
		long test= 13;
		assertTrue(test == RecursiveFunctions.fibonacci(7), "Wrong fibonacci number");
	}
	
	@Test
	void fibonacciTest3() {
		long test= 21;
		assertTrue(test == RecursiveFunctions.fibonacci(8), "Wrong fibonacci number");
	}
	
}
