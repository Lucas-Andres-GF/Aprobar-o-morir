package ar.edu.unlp.info.oo2.Heros;

public class AceroArmadura extends Armadura {

  public AceroArmadura() {
    super("Acero");
  }

  public int getDefensaVsEspada() {
    return 3;
  }

  public int getDefensaVsArco() {
    return 2;
  }

  public int getDefensaVsBaston() {
    return 1;
  }

  public int getDefensaVsMartillo() {
    return 4;
  }
}
