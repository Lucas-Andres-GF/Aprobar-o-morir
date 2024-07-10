package ar.edu.info.unlp.parcial;

public class Aceptado extends Estado {

  @Override
  public void pagarCuota(Prestamo prestamo) {
    if (prestamo.getCuotasPagas() < prestamo.getCantCuotas()) {
      prestamo.setCuotasPagas(prestamo.getCuotasPagas() + 1);
    } else {
      prestamo.setEstado(new Finalizado());
    }
  }

  public double gastoCancelacion(Prestamo prestamo) {
    return prestamo.montoRestante() + prestamo.getValorAdministrativo() + prestamo.getValorSellado();
  }

}
