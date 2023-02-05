package org.training.calculatorroman.console.addition;

import org.training.calculatorroman.calculator.CalculateRoman;
import org.training.calculatorroman.console.fileoperation.WriteOperationsInFile;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTerminal;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTextIO;

import java.io.IOException;
import java.util.List;

public class AddAtLeastThreeRomanNumber implements AddRomanNumber{

    private final RomanNumberTextIO romanNumberTextIO;
    private final CalculateRoman calculateRoman;

    private final WriteOperationsInFile writeOperationsInFile;

    private final RomanNumberTerminal romanNumberTerminal;

    public AddAtLeastThreeRomanNumber() throws IOException {

        romanNumberTerminal = new RomanNumberTerminal();
        writeOperationsInFile = new WriteOperationsInFile();
        calculateRoman = new CalculateRoman();
        romanNumberTextIO = new RomanNumberTextIO();
    }

    public void addRomanNumber(List<String> romanSymbolParams) {
        romanNumberTextIO.addWhileUserEnterRomanNumber (romanSymbolParams);
        String add = calculateRoman.add(romanSymbolParams);
        writeOperationsInFile.writeInFiles(romanSymbolParams,add);
        romanNumberTerminal.terminalColorForAtLeastThreeRomanNumberAdd(add);
    }
}
