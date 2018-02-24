package com.laba.epam.lections.tdd;

import org.junit.Before;
import org.junit.Test;

public class RomanNumericWrongArgumentTest {

    private RomanNumeric rn;

    @Before
    public void setup() {
        rn = new RomanNumeric();
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionIfNegative() {
        rn.getRoman(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionIfZero() {
        rn.getRoman(0);
    }
}
