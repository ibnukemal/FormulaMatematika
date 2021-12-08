package com.sqa.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;


import com.sqa.main.formula.FormulaBangunRuang;

public class TestingFormula {

	FormulaBangunRuang formula;

	@Before
	public void setUp() throws Exception {
		formula = new FormulaBangunRuang();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public final void testHitungLuasKotak() {		
		assertEquals(9.0, formula.hitungLuasKotak(3.0f),0.0);
	}

	@Test
	public final void testHitungVolumeKubus() {		
		assertEquals(1000.0, formula.hitungVolumeKubus(10.0f),0.0);	
	}
	
	@Test
	public final void testBagi() {
		assertEquals(3.3333333, 3.33, 0.01);	
	}
	
//	@Test
//	public final void testArray() {
//		char[][] kata = {{'K','a','t','a'},{'A','k','u'}};
//		char[][] gabung = {"Kata".toCharArray(),"Aku".toCharArray()};
//		assertArrayEquals("Array tidak sama",kata, gabung);	
//	}
//	
//	@Test
//	public final void testNull() {
//		Object sma = null;
//		assertNull("SMA Null",sma);
//	}
//	
//	@Test
//	public final void testNotSame() {
//		Object yamaha = new Object();
//		Object honda = new Object();
//		assertNotSame(yamaha, honda);	
//	}
//	
//	@Test
//	public final void testKondisi() {
//		assertTrue("10 lebih besar dari 9", 10>9);
//		assertFalse("10 lebih kecil dari 11", 10 > 11);
//	}
//	
//	@Test
//	public final void testFailTry() {
//		try {
//			testHitungVolumeKubus();
////			fail("Exception not thrown");
//		} catch (UnsupportedOperationException e) {
//			assertEquals("Operation tidak support", e.getMessage());
//		}
//	}
//
//	@Test
//	public final void testThatItem() {
//		assertThat(
//				Arrays.asList("Yamaha", "Honda", "Suzuki"),
//				hasItems("Yamaha"));
//	}

	


	
}
