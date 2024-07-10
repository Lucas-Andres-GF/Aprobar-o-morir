package ar.edu.unlp.info.oo2.Heros;

public abstract class Builder {

  protected Heroe heroe;

  public void reset() {
    this.heroe = new Heroe();
  }

  public abstract void buildArma();

  public abstract void buildArmadura();

  public abstract void buildHabilidades();

  public abstract void buildNombre();

  public void buildVida() {
    this.heroe.setVida(100);
  }

  public Heroe build() {
    Heroe heroe = this.heroe;
    this.reset();
    return heroe;
  }

}
