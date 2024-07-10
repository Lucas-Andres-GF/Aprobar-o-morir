package ar.edu.unlp.info.oo2.Heros;

public class EspadaArma extends Arma {

  public EspadaArma() {
    super("Espada");
  }

  public int getDanio(Armadura armadura) {
    return armadura.getDefensaVsEspada();
  }

}
