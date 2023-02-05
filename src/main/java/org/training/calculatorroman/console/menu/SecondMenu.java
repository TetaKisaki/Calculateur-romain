package org.training.calculatorroman.console.menu;

import org.training.calculatorroman.console.fileoperation.ReadInFile;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTerminal;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTextIO;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondMenu implements Menu {


    private final RomanNumberTerminal romanNumberTerminal;
    private final RomanNumberTextIO romanNumberTextIO;
    private final ReadInFile readInFile;
    public SecondMenu() throws FileNotFoundException {
        romanNumberTerminal = new RomanNumberTerminal();
        romanNumberTextIO = new RomanNumberTextIO();
        readInFile = new ReadInFile();
    }

    public void showMenu() throws IOException {

        romanNumberTerminal.terminal().println ("\n1- Afficher les operations");
        romanNumberTerminal.terminal().println ("2- Sortir");
        int choice = romanNumberTextIO.textIO().newIntInputReader()
                .read("Enter a choice");

        switch (choice) {
            case 1 -> readInFile.showFileHistory();
            case 2 -> System.exit (0);
            default -> romanNumberTerminal.terminal().println ("Choix invalide");
        }
    }
}
