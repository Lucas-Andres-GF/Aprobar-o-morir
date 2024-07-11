package ar.edu.unlp.info.oo2.TiendaTech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTechTest {

  Director director;
  Catalogo catalogo;

  @BeforeEach
  public void setUp() throws Exception {
    director = new Director();
    catalogo = new Catalogo();
    Componente componente1 = new Componente("Intel i7", "Procesador Gamer", 10000, 100);
    Componente componente9 = new Componente("Pad Termico", "Pad termico", 1000, 10);
    Componente componente10 = new Componente("Cooler", "Cooler", 2000, 20);
    Componente componente8 = new Componente("Memoria Gamer", "32 GB", 10000, 100);
    Componente componente3 = new Componente("Disco SSD 1TB", "SSD 1 TB", 8000, 50);
    Componente componente7 = new Componente("Disco SSD", "SSD 500 GB", 5000, 50);
    Componente componente4 = new Componente("Tarjeta Grafica", "RTX 4090", 20000, 200);
    Componente componente5 = new Componente("Gabinete Gamer", "Gabinete Gamer", 5000, 50);
    Componente componente11 = new Componente("Fuente Gamer", "Fuente 1020.0 W", 5000, 0);

    Componente componente13 = new Componente("Tarjeta intermedia", "GTX 1650", 10000, 100);
    Componente componente2 = new Componente("Memoria Gamer", "16 GB", 5000, 50);
    Componente componente14 = new Componente("Procesador intermedio", "Procesador Intermedio", 7000, 100);
    Componente componente15 = new Componente("Gabinete intermedio", "Gabinete Intermedio", 3000, 30);
    Componente componente16 = new Componente("Fuente intermedia", "Fuente 800 W", 5000, 0);

    Componente componente17 = new Componente("Procesador Basico", "Procesador Basico", 5000, 50);
    Componente componente18 = new Componente("8 GB", "8 GB", 2000, 20);
    Componente componente19 = new Componente("HDD 500 GB", "HDD 500 GB", 3000, 30);
    Componente componente20 = new Componente("Gabinete Estandar", "Gabinete Estandar", 2000, 20);

    catalogo.agregarComponente(componente1);
    catalogo.agregarComponente(componente2);
    catalogo.agregarComponente(componente3);
    catalogo.agregarComponente(componente4);
    catalogo.agregarComponente(componente5);
    catalogo.agregarComponente(componente7);
    catalogo.agregarComponente(componente8);
    catalogo.agregarComponente(componente9);
    catalogo.agregarComponente(componente10);
    catalogo.agregarComponente(componente11);
    catalogo.agregarComponente(componente13);
    catalogo.agregarComponente(componente14);
    catalogo.agregarComponente(componente15);
    catalogo.agregarComponente(componente16);
    catalogo.agregarComponente(componente17);
    catalogo.agregarComponente(componente18);
    catalogo.agregarComponente(componente19);
    catalogo.agregarComponente(componente20);

  }

  @Test
  public void compuGamertest() {
    Builder builder = new GameBuilder(catalogo);
    Presupuesto presupuesto = director.construirPresupuesto(builder, "Juan");
    System.out.println(presupuesto.toString());
  }

  @Test
  public void compuIntermediatest() {
    Builder builder = new IntermedioBuilder(catalogo);
    Presupuesto presupuesto = director.construirPresupuesto(builder, "Lucas");
    System.out.println(presupuesto.toString());
  }

  @Test
  public void compuBasicotest() {
    Builder builder = new BasicoBuilder(catalogo);
    Presupuesto presupuesto = director.construirPresupuesto2(builder, "Pedro");
    System.out.println(presupuesto.toString());
  }
}
