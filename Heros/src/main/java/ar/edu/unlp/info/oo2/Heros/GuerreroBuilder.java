package ar.edu.unlp.info.oo2.Heros;

public class GuerreroBuilder extends Builder {

  @Override
  public void buildArma() {
    this.heroe.setArma(new EspadaArma());
  }

  @Override
  public void buildArmadura() {
    this.heroe.setArmadura(new AceroArmadura());
  }

  @Override
  public void buildHabilidades() {
    String[] habilidades = { "Cuerpo a cuerpo" };
    this.heroe.setHabilidades(habilidades);
  }

  @Override
  public void buildNombre() {
    this.heroe.setNombre("Guerrero");
  }

}
