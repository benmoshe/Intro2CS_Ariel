package Exe1;
/**
 * This JUnit class represents a simple testing class for Ex1,
 * The tests are very simple, but the last (timeout) test is a bit tricky - it tests
 * the runtime of the function for 100 times - testing an average of sub 1mili-second per run.
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofMillis;

import org.junit.jupiter.api.*;

class Ex1Test {

	@Test
	void testGcd1() {
		long t = Ex1.gcd1(1, 1);
		assertEquals(t,1);
		
		t = Ex1.gcd1(2, 2);
		assertEquals(t,2);
		
		t = Ex1.gcd1(2, 3);
		assertEquals(t,1);
		
		t = Ex1.gcd1(3,2);
		assertEquals(t,1);
		
		t = Ex1.gcd1(72,48);
		assertEquals(t,24);
	}

	@Test
	void testGcd2() {
		long t = Ex1.gcd2(1, 1);
		assertEquals(t,1);
		
		t = Ex1.gcd2(2, 2);
		assertEquals(t,2);
		
		t = Ex1.gcd2(2, 3);
		assertEquals(t,1);
		
		t = Ex1.gcd2(3,2);
		assertEquals(t,1);
		
		t = Ex1.gcd2(72,48);
		assertEquals(t,24);
	}

	@Test
	void testGreaterPrimeDivider() {
		long t = Ex1.greaterPrimeDivider(1);
		assertEquals(t,1);
		
		t = Ex1.greaterPrimeDivider(2);
		assertEquals(t,2);
		
		t = Ex1.greaterPrimeDivider(6);
		assertEquals(t,3);
		
		t = Ex1.greaterPrimeDivider(33333333331L);
		assertEquals(t,108577633);
	}

	@Test
	void testGreaterPrimeCommonDivider() {
		long t = Ex1.greaterPrimeCommonDivider(1, 1);
		assertEquals(t,1);
		
		t = Ex1.greaterPrimeCommonDivider(1, 2);
		assertEquals(t,1);
		
		t = Ex1.greaterPrimeCommonDivider(2, 2);
		assertEquals(t,2);
		
		t = Ex1.greaterPrimeCommonDivider(2, 3);
		assertEquals(t,1);
		
		t = Ex1.greaterPrimeCommonDivider(2*2*3*7*13*19*19, 2*3*5*5*13*13*23*23);
		assertEquals(t,13);
		
		t = Ex1.greaterPrimeCommonDivider(33333333331L, 33333333331L);
		assertEquals(t,108577633);
	}
	/**
	 * This (runtime) test, runs the GCPD function for 100 times - testing an average of sub 1mili-second per run.
 */
	@Test
	void testGPCD_RT() {
		   assertTimeout(ofMillis(100), () -> {
			   for(int i=0;i<100;i++) {
				   long t = Ex1.greaterPrimeCommonDivider(33333333331L, 33333333331L);
			   }
		    });	
	}
}
