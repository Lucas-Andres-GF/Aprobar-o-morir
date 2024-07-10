package ar.edu.unlp.info.oo2.Meteorologica;

public class RadiacionSolarDecorator extends Decorador {

  public RadiacionSolarDecorator(Station station) {
    super(station);
  }

  @Override
  public String displayData() {
    return " Radiacion Solar: " + Math.round(this.getRadiacionSolar()) + super.displayData();
  }

}
