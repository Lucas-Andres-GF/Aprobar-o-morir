package main.java.ar.edu.unlp.info.oo2.SubteWay;

public class Componente {

  private String nombre;
  private double precio;

  public Componente(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public double getPrecio() {
    return this.precio;
  }

}
