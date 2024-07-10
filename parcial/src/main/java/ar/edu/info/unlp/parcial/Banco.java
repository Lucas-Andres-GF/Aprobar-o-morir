package ar.edu.info.unlp.parcial;

import java.util.ArrayList;
import java.util.List;

public class Banco {
  private double interes;
  private List<Cliente> clientes;

  public Banco(double interes) {
    this.interes = interes;
    this.clientes = new ArrayList<Cliente>();
  }

  private Cliente registrarCliente(String nombre, double salario) {
    Cliente cliente = new Cliente(nombre, salario);
    this.clientes.add(cliente);
    return cliente;
  }

  public void solicitarPrestamoSimple(String nombre, double salario, double monto, int cuotas) {
    Cliente cliente = this.clientes.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
    if (cliente == null) {
      cliente = this.registrarCliente(nombre, salario);
    }
    cliente.solicitarPrestamoSimple(monto, cuotas, this.interes);
  }

  public void solicitarPrestamoUVA(String nombre, double salario, double monto, int cuotas) {
    Cliente cliente = this.clientes.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
    if (cliente == null) {
      throw new RuntimeException("Cliente no encontrado");
    }
    cliente.solicitarPrestamoUVA(monto, cuotas);
  }

}
