package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberM implements RomanNumber {

  public static final String romanLetter = "M";
  public static final int romanNumber = 1_000;

  @Override
  public String valueRoman() {
    return romanLetter;
  }

  @Override
  public Integer valueNumber() {
    return romanNumber;
  }
}
