package org.training.calculatorroman.verification;

import org.jetbrains.annotations.NotNull;
import org.training.calculatorroman.exceptions.InvalidRomanSymbolException;
import org.training.calculatorroman.exceptions.NoRomanSymbolException;

import java.util.List;

public class RomanNumbersErrors {

    public final VerifyValidityOfRomanNumber verifyValidityOfRomanNumber;


    public RomanNumbersErrors() {
        verifyValidityOfRomanNumber = new VerifyValidityOfRomanNumber();
    }

    public boolean isARomanSymbol (@NotNull List<String> romanNumbers) {

        int variableTest = 0;

        variableTest = verifyValidityOfRomanNumber.acceptValidRomanNumber(romanNumbers,variableTest);
        return variableTest == romanNumbers.size();
    }
    public void emptyStringVerification(boolean romanNumbers) {
        if (romanNumbers) {
            throw new NoRomanSymbolException();
        }
    }

    public void invalidNumberverification(boolean invalidRomanNumbers) {
        if (invalidRomanNumbers) {
            throw new InvalidRomanSymbolException();
        }
    }
}
