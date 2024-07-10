package ar.edu.unlp.info.oo2.Heros;

public class Director {

  public Heroe construirHeroe(Builder heroBuilder) {
    heroBuilder.reset();
    heroBuilder.buildArma();
    heroBuilder.buildArmadura();
    heroBuilder.buildHabilidades();
    heroBuilder.buildNombre();
    heroBuilder.buildVida();
    return heroBuilder.build();
  }

}
