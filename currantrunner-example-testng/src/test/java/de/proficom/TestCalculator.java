package de.proficom;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.Assert;

public class TestCalculator {

	Calculator calc;

	@BeforeTest
	public void beforeTest() {
		this.calc = new Calculator();
	}

	@AfterTest
	public void afterTest() {
	}
	
	@Test
	public void testSum() {
		Assert.assertEquals(7, this.calc.sum(3, 4));
		Assert.assertEquals(-12, this.calc.sum(-8, -4));
	}

	@Test
	public void testSub() {
		Assert.assertEquals(0, this.calc.sub(3, 3));
		Assert.assertEquals(2, this.calc.sub(5, 3));
	}

	@Test
	public void testMul() {
		Assert.assertEquals(9, this.calc.mul(3, 3));
		Assert.assertEquals(-15, this.calc.mul(5, -3));
	}

	@Test
	public void testDiv() {
		Assert.assertEquals(5, this.calc.div(15, 3));
		Assert.assertEquals(1, this.calc.div(5, 5));
	}

}
