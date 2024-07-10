package ar.edu.unlp.info.oo2.Meteorologica;

public class PromedioCDecorador extends Decorador {

  public PromedioCDecorador(Station station) {
    super(station);
  }

  private double getPromedioTemperaturasEnCelcius() {
    return this.getTemperaturas().stream().mapToDouble(temperatura -> ((temperatura - 32) / 1.8)).average().orElse(0);
  }

  public String displayData() {
    return " Temperatura promedio en celcius: " + Math.round(this.getPromedioTemperaturasEnCelcius()) + "C"
        + super.displayData();
  }

}
