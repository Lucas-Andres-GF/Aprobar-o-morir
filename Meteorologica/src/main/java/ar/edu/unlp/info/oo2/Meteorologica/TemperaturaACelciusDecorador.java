package ar.edu.unlp.info.oo2.Meteorologica;

public class TemperaturaACelciusDecorador extends Decorador {

  public TemperaturaACelciusDecorador(Station station) {
    super(station);
  }

  public double getTemperaturaCelcius() {
    return (this.station.getTemperatura() - 32) / 1.8;
  }

  @Override
  public String displayData() {
    return " Temperatura en Celcius: " + Math.round(this.getTemperaturaCelcius()) + "C" + super.displayData();
  }
}
