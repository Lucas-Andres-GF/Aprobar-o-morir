package ar.edu.unlp.info.oo2.Meteorologica;

public class PromedioFDecorador extends Decorador {

  public PromedioFDecorador(Station station) {
    super(station);
  }

  private double getPromedioTemperaturasEnFahrenheit() {
    return this.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).average().orElse(0);
  }

  public String displayData() {
    return " Temperatura promedio en fahrenheir: " + Math.round(this.getPromedioTemperaturasEnFahrenheit()) + "F"
        + super.displayData();
  }

}
