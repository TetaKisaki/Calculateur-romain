package org.training.calculatorroman.romaninterface;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface OperatorAddRoman {

  String add(List<String>@NotNull ... params);

}
