package ar.edu.unlp.info.oo2.Heros;

public class CueroArmadura extends Armadura {

  public CueroArmadura() {
    super("Cuero");
  }

  public int getDefensaVsEspada() {
    return 8;
  }

  public int getDefensaVsArco() {
    return 5;
  }

  public int getDefensaVsBaston() {
    return 2;
  }

  public int getDefensaVsMartillo() {
    return 7;
  }

}
