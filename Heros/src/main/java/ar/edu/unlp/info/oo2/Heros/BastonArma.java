package ar.edu.unlp.info.oo2.Heros;

public class BastonArma extends Arma {

  public BastonArma() {
    super("Baston");
  }

  public int getDanio(Armadura armadura) {
    return armadura.getDefensaVsBaston();
  }

}
