package org.training.calculatorroman.console.fileoperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteOperationsInFile {

    BufferedWriter writer;
    WriteInFile writeInFile;

    public WriteOperationsInFile() throws IOException {
        this.writer = new BufferedWriter (new FileWriter("RomanCalculatorHistory.txt", true));
        this.writeInFile = new WriteInFile();
    }

    public void writeInFileForTwoRomanOperation(List<String> romanSymbolParams, String add) throws IOException {
        for (int i = 0; i < romanSymbolParams.size (); i += 2) {
            writeInFile.writeRomanNumberOperationInfile(romanSymbolParams,add,i);
        }
        writer.close ();
    }
    public void writeInFiles(List<String> romanSymbolParams, String add) {

        try {
            writeInFile.writeMultipleOperationInFile(romanSymbolParams,add);
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
    }
}
