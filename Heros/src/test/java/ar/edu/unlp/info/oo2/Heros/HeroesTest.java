package ar.edu.unlp.info.oo2.Heros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeroesTest {
  private Director director;

  @BeforeEach
  public void setUp() throws Exception {
    this.director = new Director();
  }

  @Test
  public void createGuerrero() {
    Heroe guerrero = this.director.construirHeroe(new GuerreroBuilder());
    System.out.println(guerrero.toString());
  }

  @Test
  public void createArquero() {
    Heroe arquero = this.director.construirHeroe(new ArqueroBuilder());
    System.out.println(arquero.toString());
  }

  @Test
  public void createMago() {
    Heroe mago = this.director.construirHeroe(new MagoBuilder());
    System.out.println(mago.toString());
  }

  @Test
  public void creatThoor() {
    Heroe thoor = this.director.construirHeroe(new ThoorBuilder());
    System.out.println(thoor.toString());
  }

  @Test
  public void enfrentar() {
    Heroe guerrero = this.director.construirHeroe(new GuerreroBuilder());
    Heroe arquero = this.director.construirHeroe(new ArqueroBuilder());
    Heroe mago = this.director.construirHeroe(new MagoBuilder());
    Heroe thoor = this.director.construirHeroe(new ThoorBuilder());
    guerrero.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    thoor.enfrentar(arquero);
    System.out.println(arquero.toString());
  }
}
