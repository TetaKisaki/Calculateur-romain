package org.training.calculatorroman.console.addition;

import org.training.calculatorroman.calculator.CalculateRoman;
import org.training.calculatorroman.console.fileoperation.WriteOperationsInFile;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTerminal;

import java.io.IOException;
import java.util.List;

public class AddTwoRomanNumber implements AddRomanNumber{


    private final CalculateRoman calculateRoman;

    private final WriteOperationsInFile writeOperationsInFile;

    private final RomanNumberTerminal romanNumberTerminal;

    public AddTwoRomanNumber() throws IOException {
        calculateRoman = new CalculateRoman();
        writeOperationsInFile = new WriteOperationsInFile();
        romanNumberTerminal = new RomanNumberTerminal();
    }


    public void addRomanNumber(List<String> romanSymbolParams) {

        String add = calculateRoman.add(romanSymbolParams);

        try {
           writeOperationsInFile.writeInFileForTwoRomanOperation(romanSymbolParams,add);
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
        romanNumberTerminal.terminalColorForTwoRomanNumberAdd(add);
    }
}
