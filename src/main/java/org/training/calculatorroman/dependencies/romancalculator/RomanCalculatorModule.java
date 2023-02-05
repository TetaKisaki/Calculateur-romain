package org.training.calculatorroman.dependencies.romancalculator;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import org.training.calculatorroman.calculator.CalculateRoman;

public class RomanCalculatorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CalculateRoman.class).in(Scopes.SINGLETON);
    }
}
