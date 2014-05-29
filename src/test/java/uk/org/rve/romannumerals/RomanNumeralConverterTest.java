package uk.org.rve.romannumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {

    @Test
    public void testConvert() {
        assertEquals("i", new RomanNumeralConverter().convert(1));
    }

}
