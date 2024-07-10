package ar.edu.info.unlp.parcial;

public abstract class Prestamo {

  private double monto;
  private int cantCuotas;
  private Estado estado;
  private Cliente cliente;
  private int cuotasPagadas;

  Prestamo(double monto, int cantCuotas, Cliente cliente) {
    this.monto = monto;
    this.cantCuotas = cantCuotas;
    this.cuotasPagadas = 0;
    this.cliente = cliente;
    this.estado = new Solicitado();
  }

  public void solicitarPrestamo() {
    this.estado.solicitarPrestamo(this);
  }

  public double getValorCuota() {
    return (this.monto / this.cantCuotas) * this.getInteres();
  }

  public Cliente getCliente() {
    return cliente;
  }

  public double getMonto() {
    return this.monto;
  }

  public int getCantCuotas() {
    return this.cantCuotas;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public void pagarCuota() {
    this.estado.pagarCuota(this);
  }

  public int getCuotasPagas() {
    return this.cuotasPagadas;
  }

  public void setCuotasPagas(int cuotasPagadas) {
    this.cuotasPagadas = cuotasPagadas;
  }

  
  public double montoPagado() {
    return this.getValorCuota() * this.cuotasPagadas;
  }

  public double montoRestante() {
    return this.getValorCuota() * (this.cantCuotas - this.cuotasPagadas);
  }

  public double gastoDeCancelacion() {
    return this.estado.gastoDeCancelacion(this);
  }

  public abstract double getValorSellado();

  public double getValorAdministrativo() {
    return this.montoRestante() * 0.1;
  }

  public abstract double getInteres();

}
