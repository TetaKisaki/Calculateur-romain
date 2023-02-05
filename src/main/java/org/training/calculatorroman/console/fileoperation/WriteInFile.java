package org.training.calculatorroman.console.fileoperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteInFile {

    private final BufferedWriter writer;

    public WriteInFile() throws IOException {
        this.writer = new BufferedWriter (new FileWriter ("RomanCalculatorHistory.txt", true));
    }
    public void writeOperationInFile(List<String> romanSymbolParams, String add, int i) throws IOException {
        if (i != romanSymbolParams.size() - 1) {
            writeAdditionOfRomanNumber(romanSymbolParams, i);
        } else {
            writeResultOfAdditionRomanNumber(romanSymbolParams, add, i);
        }
    }
    private void writeResultOfAdditionRomanNumber(List<String> romanSymbolParams, String add, int i) throws IOException {
        writer.write (romanSymbolParams.get (i) + " = " + add);
    }

    private void writeAdditionOfRomanNumber(List<String> romanSymbolParams, int i) throws IOException {
        writer.write (romanSymbolParams.get (i) + " + ");
    }

    public void writeMultipleOperationInFile(List<String> romanSymbolParams, String add) throws IOException {
        int romanSymbolListSize = romanSymbolParams.size();
        writer.newLine();
        for (int i = 0; i < romanSymbolListSize ; i++) {
            writeOperationInFile(romanSymbolParams, add, i);
        }
        writer.close();
    }
    public void writeRomanNumberOperationInfile(List<String> romanSymbolParams, String add, int i) throws IOException {
        writer.newLine();
        writer.write(romanSymbolParams.get(i) + " + " + romanSymbolParams.get(i + 1) + " = " + add);
        writer.close();
    }
}
