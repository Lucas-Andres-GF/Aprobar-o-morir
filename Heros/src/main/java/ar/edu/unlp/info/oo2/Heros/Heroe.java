package ar.edu.unlp.info.oo2.Heros;

public class Heroe {
  private String nombre;
  private Armadura armadura;
  private Arma arma;
  private String[] habilidades;
  private int vida;

  public void setArma(Arma arma) {
    this.arma = arma;
  }

  public void setArmadura(Armadura armadura) {
    this.armadura = armadura;
  }

  public void setHabilidades(String[] habilidades) {
    this.habilidades = habilidades;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public Armadura getArmadura() {
    return this.armadura;
  }

  public int getVida() {
    return vida;
  }

  public boolean murio() {
    return this.vida <= 0;
  }

  public void enfrentar(Heroe heroe) {
    if (heroe.getVida() <= 0) {
      System.out.println("El heroe " + heroe.nombre + " ha muerto");
      return;
    }
    int danio = this.arma.getDanio(heroe.getArmadura());
    if (heroe.getVida() - danio < 0) {
      System.out.println(
          "Has matado a " + heroe.nombre + " con " + this.arma.getNombre() + " y " + this.armadura.getNombre());
      heroe.setVida(0);
      return;
    }
    heroe.setVida(heroe.getVida() - danio);
  }

  public String toString() {
    return "Nombre: " + this.nombre + "\nVida: " + this.vida + "\nArma: " + this.arma.getNombre() + "\nArmadura: "
        + this.armadura.getNombre() + "\nHabilidades: " + String.join(", ", this.habilidades);
  }

}
