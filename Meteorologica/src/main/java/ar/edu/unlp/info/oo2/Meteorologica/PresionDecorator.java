package ar.edu.unlp.info.oo2.Meteorologica;

public class PresionDecorator extends Decorador {

  public PresionDecorator(Station station) {
    super(station);
  }

  public String displayData() {
    return " Presion: " + Math.round(super.getPresion()) + "hPa" + super.displayData();
  }
}
