package org.training.calculatorroman.console.romannumberconsole;


import org.beryx.textio.swing.SwingTextTerminal;

import static java.awt.Color.*;

public class RomanNumberTerminal {

    private final SwingTextTerminal terminal;
    RomanNumberTextIO romanNumberTextIO;

    public RomanNumberTerminal() {
        romanNumberTextIO = new RomanNumberTextIO();
        this.terminal = (SwingTextTerminal)romanNumberTextIO.textIO().getTextTerminal();
    }

    public void terminalColorForFirstMenu() {
        terminal.getProperties().setPromptColor(blue);
        terminal.println ("\s\sROMAN CALCULATOR\n");
        terminal.getProperties().setPromptColor(green);
    }

    public void terminalColorForAtLeastThreeRomanNumberAdd(String add) {
        terminal.getProperties().setPromptColor(cyan);
        terminal.println ("\nLe resultat est " + add);
        terminal.getProperties().setPromptColor(green);
    }

    public void terminalColorForTwoRomanNumberAdd(String add) {
        terminal.getProperties().setPromptColor(white);
        terminal.println ("\nLe resultat est " + add);
        terminal.getProperties().setPromptColor(green);
    }

    //GETTER

    public SwingTextTerminal terminal() {
        return terminal;
    }
}
