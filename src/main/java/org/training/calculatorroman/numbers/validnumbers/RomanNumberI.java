package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberI implements RomanNumber {

  public static final String ROMAN_LETTER = "I";
  public static final int ROMAN_NUMBER = 1;

  @Override
  public String valueRoman() {
    return ROMAN_LETTER;
  }

  @Override
  public Integer valueNumber() {
    return ROMAN_NUMBER;
  }
}
