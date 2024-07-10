package ar.edu.unlp.info.oo2.Meteorologica;

public class Decorador implements Station {
  protected Station station;

  public Decorador(Station station) {
    this.station = station;
  }

  @Override
  public double getTemperatura() {
    return this.station.getTemperatura();
  }

  @Override
  public double getPresion() {
    return this.station.getPresion();
  }

  @Override
  public double getRadiacionSolar() {
    return this.station.getRadiacionSolar();
  }

  @Override
  public java.util.List<Double> getTemperaturas() {
    return this.station.getTemperaturas();
  }

  @Override
  public String displayData() {
    return this.station.displayData();
  }
}
