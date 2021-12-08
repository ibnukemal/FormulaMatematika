package com.sqa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sqa.main.formula.FormulaSegitiga;



public class TestingFormulaSegitiga {

	FormulaSegitiga formula; 
	
	@Before
	public void setUp() throws Exception {
		formula = new FormulaSegitiga();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHitungLuasSegitiga() {
		assertEquals(4.0, formula.hitungLuasSegitiga(4.0, 2.0),0.0);
	}

}
