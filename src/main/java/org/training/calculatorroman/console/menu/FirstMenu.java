package org.training.calculatorroman.console.menu;

import org.training.calculatorroman.console.addition.AddAtLeastThreeRomanNumber;
import org.training.calculatorroman.console.addition.AddTwoRomanNumber;
import org.training.calculatorroman.console.romannumberconsole.RomanNumberTextIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.yellow;

public class FirstMenu implements Menu {

    private final RomanNumberTextIO romanNumberTextIO;
    private final AddAtLeastThreeRomanNumber addAtLeastThreeRomanNumber;
    private final AddTwoRomanNumber addTwoRomanNumber;
    private final SecondMenu secondMenu;

    List<String> romanSymbolParams = new ArrayList<>();

    public FirstMenu() throws IOException {
        romanNumberTextIO = new RomanNumberTextIO();
        addAtLeastThreeRomanNumber = new AddAtLeastThreeRomanNumber();
        addTwoRomanNumber = new AddTwoRomanNumber();
        secondMenu = new SecondMenu();
    }

    @Override
    public void showMenu() throws IOException {
        romanSymbolParams.add (romanNumberTextIO.textIO().newStringInputReader()
                .read ("Veuillez saisir un chiffre romain"));

        romanSymbolParams.add (romanNumberTextIO.textIO().newStringInputReader()
                .read ("Veuillez saisir un autre chiffre romain"));

        String choiceMenu = romanNumberTextIO.textIO().newStringInputReader()
                .withPropertiesConfigurator(props -> props.setPromptColor(yellow))
                .read (" Voulez-vous saisir un autre chiffre romain ? Y/N");

        menuSwitch(choiceMenu,romanSymbolParams);

    }

    private void menuSwitch(String choiceMenu,List<String> romanSymbolParams) throws IOException {

        switch (choiceMenu) {
            case "Y" -> {
                addAtLeastThreeRomanNumber.addRomanNumber(romanSymbolParams);
                secondMenu.showMenu();
            }
            case "N" -> {
                addTwoRomanNumber.addRomanNumber(romanSymbolParams);
                secondMenu.showMenu();
            }
            default -> throw new IllegalStateException("Unexpected value: " + choiceMenu);
        }
    }

}
