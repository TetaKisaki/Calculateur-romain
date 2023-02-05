package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberL implements RomanNumber {

  public static final String romanLetter = "L";
  public static final int romanNumber = 50;

  @Override
  public String valueRoman() {
    return romanLetter;
  }

  @Override
  public Integer valueNumber() {
    return romanNumber;
  }
}
