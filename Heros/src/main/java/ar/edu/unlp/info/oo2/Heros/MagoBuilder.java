package ar.edu.unlp.info.oo2.Heros;

public class MagoBuilder extends Builder {

  @Override
  public void buildArma() {
    this.heroe.setArma(new BastonArma());
  }

  @Override
  public void buildArmadura() {
    this.heroe.setArmadura(new CueroArmadura());
  }

  @Override
  public void buildHabilidades() {
    String[] habilidades = { "Magia" };
    this.heroe.setHabilidades(habilidades);
  }

  @Override
  public void buildNombre() {
    this.heroe.setNombre("Mago");
  }
}
