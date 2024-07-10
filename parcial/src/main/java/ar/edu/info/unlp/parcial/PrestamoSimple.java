package ar.edu.info.unlp.parcial;

public class PrestamoSimple extends Prestamo {

  private double interes;

  PrestamoSimple(double monto, int cuotas, double interes, Cliente cliente) {
    super(monto, cuotas, cliente);
    this.interes = interes;
  }

  public double getInteres() {
    return interes;
  }

  @Override
  public double getValorSellado() {
    return 5000;
  }

}
