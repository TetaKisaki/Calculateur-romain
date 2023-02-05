package org.training.calculatorroman.calculator;

import org.jetbrains.annotations.NotNull;
import org.training.calculatorroman.converter.ConvertIntegerToRomanNumber;
import org.training.calculatorroman.converter.ConvertRomanSymbolToInteger;
import org.training.calculatorroman.romaninterface.OperatorAddRoman;

import java.util.List;

public class CalculateRoman implements OperatorAddRoman {

  private final ConvertRomanSymbolToInteger convertRomanSymbolToInteger = new ConvertRomanSymbolToInteger ();
  private final ConvertIntegerToRomanNumber convertIntegerToRomanNumber = new ConvertIntegerToRomanNumber ();

  @SafeVarargs
  @Override
  public final String add(List<String> @NotNull ... params) {

    int sum = 0;

    for (List<String> param : params) {
      int convert = convertRomanSymbolToInteger.convert (param);
      sum += convert;
    }
    return convertIntegerToRomanNumber.convertToRomanNumbers (sum);
  }
}
