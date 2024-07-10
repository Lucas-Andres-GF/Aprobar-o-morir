package ar.edu.unlp.info.oo2.Heros;

public class MartilloArma extends Arma {

  public MartilloArma() {
    super("Martillo");
  }

  public int getDanio(Armadura armadura) {
    return armadura.getDefensaVsMartillo();
  }

}
