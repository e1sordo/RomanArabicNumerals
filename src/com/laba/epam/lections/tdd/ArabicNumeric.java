package com.laba.epam.lections.tdd;

/**
 * Translator from roman to arabic.
 */
public class ArabicNumeric {

    private enum Roman {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private final int value;

        Roman(int value) {
            this.value = value;
        }
    }

    /**
     * Gets arabic numerals by translating roman.
     *
     * @param romanNumeric the roman numeric
     * @return Arabic representation of the Roman number
     */
    public int getArabic(String romanNumeric) {

        if ((null == romanNumeric) || romanNumeric.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int arabic = 0;
        int previous = 0;

        for (int i = 0; i < romanNumeric.length(); ++i) {
            int current = Roman.valueOf(String.valueOf(romanNumeric.charAt(i))).value;

            if ((previous < current) && (current > 0)) {
                current -= previous;
                arabic -= previous;
            }

            arabic += current;
            previous = current;
        }

        return arabic;
    }
}
