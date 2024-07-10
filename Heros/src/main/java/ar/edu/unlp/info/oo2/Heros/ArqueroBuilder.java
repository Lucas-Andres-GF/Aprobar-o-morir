package ar.edu.unlp.info.oo2.Heros;

public class ArqueroBuilder extends Builder {
  @Override
  public void buildArma() {
    this.heroe.setArma(new ArcoArma());
  }

  @Override
  public void buildArmadura() {
    this.heroe.setArmadura(new CueroArmadura());
  }

  @Override
  public void buildHabilidades() {
    String[] habilidades = { "Expecialista en tiro con flechas" };
    this.heroe.setHabilidades(habilidades);
  }

  @Override
  public void buildNombre() {
    this.heroe.setNombre("Arquero");
  }

}
