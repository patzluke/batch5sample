package org.ssglobal.training.codes.test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.ssglobal.training.codes.MathOps;

@TestMethodOrder(value = OrderAnnotation.class)
public class TestMathOps {
	private MathOps mo;

	@BeforeEach
	public void setup() {
		mo = new MathOps();
	}
	
	@AfterEach
	public void teardown() {
		mo = null;
		System.out.println();
	}
	
	@Order(value = 1)
	@Test
	public void testDivOps() {
		assertDoesNotThrow(() -> {
			int result = mo.divide(10, 2);
			assertEquals(5, result);
		});
	}
	
	@Order(value = 2)
	@Test
	public void testDivOpsThrowsError() {
		assertThrows(ArithmeticException.class, () -> {
			int result = mo.divide(10, 0);
			assertEquals(0, result);
		});
	}
	
	@Order(value = 3)
	@Test
	public void testDisplayArray() {
		int[] testData = {10, 20, 30, 40};
		int[] result = mo.displayArray(testData);
		assertSame(testData, result);
	}
	
	@Order(value = 3)
	@Test
	public void testDisplayArrayRainy() {
		int[] testData = null;
		int[] result = mo.displayArray(testData);
		assertSame(testData, result);
	}
	
	@Order(value = 4)
	@Test
	public void testAddOp() {
		assertEquals(5, mo.add(2, 3));
	}
}
