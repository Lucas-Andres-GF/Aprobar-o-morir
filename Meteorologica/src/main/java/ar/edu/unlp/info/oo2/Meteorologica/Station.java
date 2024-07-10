package ar.edu.unlp.info.oo2.Meteorologica;

import java.util.List;

public interface Station {
  public double getTemperatura();

  public double getPresion();

  public double getRadiacionSolar();

  public List<Double> getTemperaturas();

  public String displayData();

}
