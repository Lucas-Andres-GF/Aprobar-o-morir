package ar.edu.unlp.info.oo2.Heros;

public abstract class Armadura {

  private String nombre;

  public Armadura(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public abstract int getDefensaVsEspada();

  public abstract int getDefensaVsArco();

  public abstract int getDefensaVsBaston();

  public abstract int getDefensaVsMartillo();

}
