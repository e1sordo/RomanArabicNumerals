package com.laba.epam.lections.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RomanNumericParameterizedTest {

    private final int input;
    private final String expected;
    private RomanNumeric rn;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, "I"},          {2, "II"},       {4, "IV"},
                {6, "VI"},         {8, "VIII"},     {11, "XI"},
                {13, "XIII"},      {14, "XIV"},     {28, "XXVIII"},
                {33, "XXXIII"},    {42, "XLII"},    {63, "LXIII"},
                {82, "LXXXII"},    {94, "XCIV"},    {174, "CLXXIV"},
                {399, "CCCXCIX"},  {401, "CDI"},    {628, "DCXXVIII"},
                {777, "DCCLXXVII"},{923, "CMXXIII"},{1947, "MCMXLVII"},
        });
    }

    public RomanNumericParameterizedTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        rn = new RomanNumeric();
    }

    @Test(timeout = 10)
    public void test() {
        assertEquals(expected, rn.getRoman(input));
    }

    @After
    public void teardown() {
        rn = null;
    }
}