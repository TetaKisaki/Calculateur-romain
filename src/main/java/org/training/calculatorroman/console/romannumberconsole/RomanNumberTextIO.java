package org.training.calculatorroman.console.romannumberconsole;

import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

import java.util.List;
import java.util.Objects;

import static java.awt.Color.yellow;

public class RomanNumberTextIO {

   private final TextIO textIO;

    public RomanNumberTextIO() {
       this.textIO = TextIoFactory.getTextIO();
    }

    public void addWhileUserEnterRomanNumber(List<String> romanSymbolParams) {
        boolean choice;
        int i = 0;
        int romanSymbolListSize = romanSymbolParams.size();
        while (i < romanSymbolListSize) {
            choice = choices(romanSymbolParams);
            if (Objects.equals (choice, "N")) {
                i = romanSymbolListSize;
            }
            i++;
        }
    }
    public boolean choices(List<String> romanSymbolParams) {
        boolean choice;
        romanSymbolParams.add (textIO.newStringInputReader ()
                .read ("Veuillez saisir un autre chiffre romain"));
        choice = textIO.newBooleanInputReader()
                .withPropertiesConfigurator(props -> props.setPromptColor (yellow))
                .withDefaultValue(true)
                .read (" Voulez-vous saisir un autre chiffre romain ? Y/N");
        return choice;
    }

    //GETTER


    public TextIO textIO() {
        return textIO;
    }
}
