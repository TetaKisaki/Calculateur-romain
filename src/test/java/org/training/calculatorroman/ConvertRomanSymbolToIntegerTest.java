package org.training.calculatorroman;

import org.junit.jupiter.api.*;
import org.training.calculatorroman.converter.ConvertRomanSymbolToInteger;
import org.training.calculatorroman.verification.RomanNumbersErrors;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ConvertRomanSymbolToIntegerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertRomanListInNumerals() {
        var convertRomanSymbol = new ConvertRomanSymbolToInteger();
        List<String> romanSymbolList = new ArrayList<> ();
       romanSymbolList.add("VII");
       romanSymbolList.add("XII");
        int convert = convertRomanSymbol.convert (romanSymbolList);
        assertEquals(19,convert);
    }

    @Test
    void verifyIfIsARomanSymbolListWork() {
        RomanNumbersErrors romanNumbersErrors = new RomanNumbersErrors();
        List<String> romanSymbolList = new ArrayList<> ();
        romanSymbolList.add("VII");
        romanSymbolList.add("XII");
        boolean m = romanNumbersErrors.isARomanSymbol (romanSymbolList);
        assertTrue(m);
    }
}