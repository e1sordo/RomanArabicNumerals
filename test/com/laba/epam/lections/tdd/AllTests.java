package com.laba.epam.lections.tdd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArabicNumericParameterizedTest.class,
        ArabicNumericWrongArgumentTest.class,
        RomanNumericParameterizedTest.class,
        RomanNumericWrongArgumentTest.class
})
public class AllTests {
}
