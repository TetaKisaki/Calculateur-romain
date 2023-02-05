package org.training.calculatorroman.numbers.validnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberV implements RomanNumber {

  public static final String ROMAN_LETTER = "V";
  public static final int ROMAN_NUMBER = 5;

  @Override
  public String valueRoman() {
    return ROMAN_LETTER;
  }

  @Override
  public Integer valueNumber() {
    return ROMAN_NUMBER;
  }
}
