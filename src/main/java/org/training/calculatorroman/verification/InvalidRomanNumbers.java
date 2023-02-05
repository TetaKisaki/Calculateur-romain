package org.training.calculatorroman.verification;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class InvalidRomanNumbers {

    private final VerifyInvalidityOfRomanNumbers verifyInvalidityOfRomanNumbers;

    public InvalidRomanNumbers() {
        verifyInvalidityOfRomanNumbers = new VerifyInvalidityOfRomanNumbers();
    }

    public boolean isRomanSymbolInvalid(@NotNull List<String> romanNumbers) {
        return verifyInvalidityOfRomanNumbers.aRomanSymbolIsInvalid(romanNumbers);
    }

    public boolean isRomanSymbolInvalid (@NotNull String symbolToTest) {
        return verifyInvalidityOfRomanNumbers.anyMatch(symbolToTest);
    }

}
