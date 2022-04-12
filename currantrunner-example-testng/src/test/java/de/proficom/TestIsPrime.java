package de.proficom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class TestIsPrime {
	@DataProvider(name = "data_primenumbers")
	public Object[][] testdata() {
		return new Object[][] { { 1, false }, { 2, true }, { 3, true }, { 4, false }, { 10, false}, { 9, false} };
	}

	Calculator calc;

	@BeforeTest
	public void beforeTest() {
		this.calc = new Calculator();
	}

	@Test(dataProvider = "data_primenumbers")
	public void testIsPrime(int number, boolean expectPrime) {
		Assert.assertEquals(expectPrime, this.calc.isPrime(number));
	}

}
