package ar.edu.unlp.info.oo2.Meteorologica;

public class EstacionMeteorologica implements Station {
  private HomeWeatherStation homeWeatherStation;

  public EstacionMeteorologica(HomeWeatherStation homeWeatherStation) {
    this.homeWeatherStation = homeWeatherStation;
  }

  @Override
  public double getTemperatura() {
    return this.homeWeatherStation.getTemperatura();
  }

  @Override
  public double getPresion() {
    return this.homeWeatherStation.getPresion();
  }

  @Override
  public double getRadiacionSolar() {
    return this.homeWeatherStation.getRadiacionSolar();
  }

  @Override
  public java.util.List<Double> getTemperaturas() {
    return this.homeWeatherStation.getTemperaturas();
  }

  @Override
  public String displayData() {
    return "";
  }

}
