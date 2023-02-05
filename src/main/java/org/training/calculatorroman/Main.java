package org.training.calculatorroman;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.training.calculatorroman.dependencies.romancalculator.RomanCalculatorEditor;
import org.training.calculatorroman.dependencies.romancalculator.RomanCalculatorModule;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
      Injector injector = Guice.createInjector(new RomanCalculatorModule());
      RomanCalculatorEditor editor = injector.getInstance(RomanCalculatorEditor.class);
      editor.launchApp();
  }
}
