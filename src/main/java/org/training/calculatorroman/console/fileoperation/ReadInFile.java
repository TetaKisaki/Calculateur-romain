package org.training.calculatorroman.console.fileoperation;

import org.training.calculatorroman.console.romannumberconsole.RomanNumberTerminal;

import java.io.*;

import static java.awt.Color.orange;

public class ReadInFile {
    private final BufferedReader reader;
    RomanNumberTerminal romanNumberTerminal;

    public ReadInFile() throws FileNotFoundException {
        reader = new BufferedReader (new FileReader ("RomanCalculatorHistory.txt"));
        romanNumberTerminal = new RomanNumberTerminal();
    }


    public void showFileHistory() throws IOException {
        String line;
        while ((line = reader.readLine ()) != null) {
            romanNumberTerminal.terminal().getProperties().setPromptColor(orange);
            romanNumberTerminal.terminal().println ("\n");
            romanNumberTerminal.terminal().println (line);
        }
    }
}
