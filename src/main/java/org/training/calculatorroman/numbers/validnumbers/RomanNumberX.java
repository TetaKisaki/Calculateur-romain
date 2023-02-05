package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberX implements RomanNumber {

  public static final String romanLetter = "X";
  public static final int romanNumber = 10;

  @Override
    public String valueRoman() {
    return romanLetter;
  }

  @Override
    public Integer valueNumber() {
        return romanNumber;
    }
}
