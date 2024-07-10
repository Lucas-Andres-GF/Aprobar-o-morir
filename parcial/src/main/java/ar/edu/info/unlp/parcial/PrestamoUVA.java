package ar.edu.info.unlp.parcial;

import java.util.Random;

public class PrestamoUVA extends Prestamo {

  PrestamoUVA(double monto, int cuotas, Cliente cliente) {
    super(monto, cuotas, cliente);
  }

  @Override
  public double getInteres() {
    Random random = new Random();
    return random.nextDouble();
  }

  @Override
  public double getValorSellado() {
    return 0;
  }

}
