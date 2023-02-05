package org.training.calculatorroman.dependencies.romancalculator;

import org.training.calculatorroman.console.CalculatorRomanInConsole;

import javax.inject.Inject;
import java.io.IOException;

public class RomanCalculatorEditor {
    private final CalculatorRomanInConsole calculatorRomanInConsole;

    @Inject
    public RomanCalculatorEditor(CalculatorRomanInConsole calculatorRomanInConsole) {
        this.calculatorRomanInConsole = calculatorRomanInConsole;
    }

    public void launchApp() throws IOException {
        calculatorRomanInConsole.launchRomanCalculator();
    }
}
