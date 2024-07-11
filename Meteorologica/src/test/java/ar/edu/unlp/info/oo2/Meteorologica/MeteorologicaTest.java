package ar.edu.unlp.info.oo2.Meteorologica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MeteorologicaTest {

  HomeWeatherStation homeWeatherStation;
  EstacionMeteorologica estacionMeteorologica;
  TemperaturaACelciusDecorador temperaturaACelciusDecorador;
  TemperaturaAFahrenheitDecorator temperaturaAFahrenheitDecorator;
  PresionDecorator presionDecorator;
  RadiacionSolarDecorator radiacionSolarDecorator;
  PromedioCDecorador promedioCDecorador;
  PromedioFDecorador promedioFDecorador;

  @BeforeEach
  public void setUp() throws Exception {
    this.homeWeatherStation = new HomeWeatherStation(52, 1008, 500);
    this.homeWeatherStation.addTemperatura(50);
    this.homeWeatherStation.addTemperatura(55);
    this.homeWeatherStation.addTemperatura(60);
    this.estacionMeteorologica = new EstacionMeteorologica(this.homeWeatherStation);
  }

  @Test
  public void testGetTemperatura() {
    temperaturaAFahrenheitDecorator = new TemperaturaAFahrenheitDecorator(this.estacionMeteorologica);
    temperaturaACelciusDecorador = new TemperaturaACelciusDecorador(temperaturaAFahrenheitDecorator);
    temperaturaACelciusDecorador = new TemperaturaACelciusDecorador(temperaturaACelciusDecorador);
    System.out.println(this.temperaturaACelciusDecorador.displayData());
  }

  @Test
  public void testGetTemperaturaCelcius() {
    this.temperaturaACelciusDecorador = new TemperaturaACelciusDecorador(this.estacionMeteorologica);
    this.temperaturaAFahrenheitDecorator = new TemperaturaAFahrenheitDecorator(this.temperaturaACelciusDecorador);
    this.presionDecorator = new PresionDecorator(this.temperaturaAFahrenheitDecorator);
    this.radiacionSolarDecorator = new RadiacionSolarDecorator(this.presionDecorator);
    this.promedioCDecorador = new PromedioCDecorador(this.radiacionSolarDecorator);
    this.promedioFDecorador = new PromedioFDecorador(this.promedioCDecorador);
    System.out.println(this.promedioFDecorador.displayData());
  }

}
