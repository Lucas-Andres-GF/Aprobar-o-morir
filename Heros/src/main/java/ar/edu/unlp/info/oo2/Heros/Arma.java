package ar.edu.unlp.info.oo2.Heros;

public abstract class Arma {
  private String nombre;

  public Arma(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public abstract int getDanio(Armadura armadura);

}
