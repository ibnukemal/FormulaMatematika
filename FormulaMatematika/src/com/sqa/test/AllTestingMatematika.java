package com.sqa.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestingFormula.class, TestingFormulaSegitiga.class, TestingFormulaTabung.class })
public class AllTestingMatematika {

}
