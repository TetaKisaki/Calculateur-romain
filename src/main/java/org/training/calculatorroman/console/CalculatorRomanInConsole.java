package org.training.calculatorroman.console;


import org.training.calculatorroman.console.menu.FirstMenu;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTerminal;

import java.io.*;


public class CalculatorRomanInConsole {

    private final RomanNumberTerminal romanNumberTerminal;
    private final FirstMenu firstMenu;

    public CalculatorRomanInConsole() throws IOException {
        romanNumberTerminal = new RomanNumberTerminal();
        firstMenu = new FirstMenu();
    }

    public void launchRomanCalculator() throws IOException {
        romanNumberTerminal.terminalColorForFirstMenu();
        firstMenu.showMenu();
    }
}
