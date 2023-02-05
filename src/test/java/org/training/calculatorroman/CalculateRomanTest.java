package org.training.calculatorroman;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.training.calculatorroman.calculator.CalculateRoman;
import org.training.calculatorroman.exceptions.InvalidRomanSymbolException;
import org.training.calculatorroman.exceptions.IsNotARomanSymbolException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRomanTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addString() {
        List<String> romanSymbolList = new ArrayList<> ();
        romanSymbolList.add("V");
        romanSymbolList.add("V");
        var calculatorRoman = new CalculateRoman();
        String add = calculatorRoman.add (romanSymbolList);
        assertEquals ("X",add);
    }

    @Test
    void addList() {
        var calculatorRoman = new CalculateRoman();
        List<String> romanSymbolList = new ArrayList<> ();
        romanSymbolList.add("VII");
        romanSymbolList.add("XII");
        String add = calculatorRoman.add (romanSymbolList);
        assertEquals ("XIX",add);
    }

    @Test
    void verifyIfInvalidErrorsInAddWorks() {
        List<String> romanSymbolList = new ArrayList<> ();
        romanSymbolList.add("VII");
        romanSymbolList.add("XII");
        romanSymbolList.add("MMMM");
        var calculatorRoman = new CalculateRoman();
        assertThrows (InvalidRomanSymbolException.class, calculatorRoman::add);
    }

    @Test
    void verifyIfUnknowLetterErrorsInAddWorks() {
        List<String> romanSymbolList = new ArrayList<> ();
        romanSymbolList.add("VII");
        romanSymbolList.add("XII");
        romanSymbolList.add("IE");
        var calculatorRoman = new CalculateRoman();
        assertThrows (IsNotARomanSymbolException.class, () -> {
            calculatorRoman.add (romanSymbolList);
        });
    }

}