package ar.edu.unlp.info.oo2.Meteorologica;

public class TemperaturaAFahrenheitDecorator extends Decorador {

  public TemperaturaAFahrenheitDecorator(Station station) {
    super(station);
  }

  @Override
  public String displayData() {
    return " Temperatura en Fahrenheit: " + Math.round(this.getTemperatura()) + "F" + super.displayData();
  }

}
