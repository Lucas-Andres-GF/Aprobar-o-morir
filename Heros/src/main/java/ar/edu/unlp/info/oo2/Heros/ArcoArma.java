package ar.edu.unlp.info.oo2.Heros;

public class ArcoArma extends Arma {

  public ArcoArma() {
    super("Arco");
  }

  public int getDanio(Armadura armadura) {
    return armadura.getDefensaVsArco();
  }
}
