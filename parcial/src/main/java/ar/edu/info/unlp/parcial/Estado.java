package ar.edu.info.unlp.parcial;

public abstract class Estado {

  public void solicitarPrestamo(Prestamo prestamo) {
    if ((prestamo.getCliente().getSalario() * 0.3) < (prestamo.getValorCuota())) {
      prestamo.setEstado(new Rechazado());
    } else {
      prestamo.setEstado(new Aceptado());
    }
  }

  public void pagarCuota(Prestamo prestamo) {
    throw new Error("error");
  }

  public double gastoDeCancelacion(Prestamo prestamo) {
    throw new Error("error");
  }

}
