package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberC implements RomanNumber {

  public static final String romanLetter = "C";
  public static final int romanNumber = 100;

  @Override
  public String valueRoman() {
    return romanLetter;
  }

  @Override
  public Integer valueNumber() {
    return romanNumber;
  }
}
