package ar.edu.info.unlp.parcial;

public class Cliente {
  private Prestamo prestamo;
  private String nombre;
  private double salario;

  public Cliente(String nombre, double salario) {
    this.nombre = nombre;
    this.salario = salario;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void solicitarPrestamoSimple(double monto, int cuotas, double interes) {
    this.prestamo = new PrestamoSimple(monto, cuotas, interes, this);
    prestamo.solicitarPrestamo();
  }

  public void solicitarPrestamoUVA(double monto, int cuotas) {
    this.prestamo = new PrestamoUVA(monto, cuotas, this);
    prestamo.solicitarPrestamo();
  }

  public double getSalario() {
    return this.salario;
  }
}
