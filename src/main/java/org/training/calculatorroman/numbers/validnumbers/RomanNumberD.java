package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberD implements RomanNumber {

  public static final String romanLetter = "D";
  public static final int romanNumber = 500;

  @Override
  public String valueRoman() {
    return romanLetter;
  }

  @Override
  public Integer valueNumber() {
    return romanNumber;
  }
}
