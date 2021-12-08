package com.sqa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sqa.main.formula.FormulaTabung;

public class TestingFormulaTabung {

	FormulaTabung formula;
	
	@Before
	public void setUp() throws Exception {
		formula = new FormulaTabung();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHitungVolumeTabung() {
		assertEquals(401.92, formula.hitungVolumeTabung(4.0, 8.0),0.0);
	}

}
