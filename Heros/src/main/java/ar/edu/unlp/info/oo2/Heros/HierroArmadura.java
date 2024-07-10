package ar.edu.unlp.info.oo2.Heros;

public class HierroArmadura extends Armadura {

  public HierroArmadura() {
    super("Hierro");
  }

  public int getDefensaVsEspada() {
    return 5;
  }

  public int getDefensaVsArco() {
    return 3;
  }

  public int getDefensaVsBaston() {
    return 1;
  }

  public int getDefensaVsMartillo() {
    return 4;
  }

}
