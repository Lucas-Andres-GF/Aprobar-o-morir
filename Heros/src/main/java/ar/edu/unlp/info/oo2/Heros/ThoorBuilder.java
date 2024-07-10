package ar.edu.unlp.info.oo2.Heros;

public class ThoorBuilder extends Builder {

  @Override
  public void buildArma() {
    this.heroe.setArma(new MartilloArma());
  }

  @Override
  public void buildArmadura() {
    this.heroe.setArmadura(new HierroArmadura());
  }

  @Override
  public void buildHabilidades() {
    String[] habilidades = { "Lanzar rayos", "Combate a distancia" };
    this.heroe.setHabilidades(habilidades);
  }

  @Override
  public void buildNombre() {
    this.heroe.setNombre("Thoor");
  }
}
