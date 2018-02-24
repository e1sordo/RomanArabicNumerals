package com.laba.epam.lections.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class ArabicNumericParameterizedTest {

    private final String input;
    private final int expected;
    private ArabicNumeric an;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return RomanNumericParameterizedTest.data();
    }

    public ArabicNumericParameterizedTest(int expected, String input) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        an = new ArabicNumeric();
    }

    @Test(timeout = 10)
    public void test() {
        assertEquals(expected, an.getArabic(input));
    }

    @After
    public void teardown() {
        an = null;
    }
}
