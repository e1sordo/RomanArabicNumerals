package com.laba.epam.lections.tdd;

import org.junit.Before;
import org.junit.Test;

public class ArabicNumericWrongArgumentTest {

    private ArabicNumeric an;

    @Before
    public void setup() {
        an = new ArabicNumeric();
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionIfWrong() {
        an.getArabic("Hello");
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionIfNull() {
        an.getArabic(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionIfEmptyLine() {
        an.getArabic("");
    }
}
