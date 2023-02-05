package org.training.calculatorroman;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.training.calculatorroman.converter.ConvertIntegerToRomanNumber;
import org.training.calculatorroman.exceptions.NumberAboveRomanNumberLimitException;

import static org.junit.jupiter.api.Assertions.*;

class ConvertIntegerToRomanNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToRomanNumbers() {
        var convertIntegerToRomanNumber = new ConvertIntegerToRomanNumber ();
        String fortyNine = convertIntegerToRomanNumber.convertToRomanNumbers (49);
        assertEquals ("XLIX",fortyNine);
    }

    @Test
    void verifyIfErrorsWorks() {
        var convertIntegerToRomanNumber = new ConvertIntegerToRomanNumber ();
        assertThrows (NumberAboveRomanNumberLimitException.class, () -> {
            convertIntegerToRomanNumber.convertToRomanNumbers (7000);
        });
    }
}