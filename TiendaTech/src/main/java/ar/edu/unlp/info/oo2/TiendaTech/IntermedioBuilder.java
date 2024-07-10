package ar.edu.unlp.info.oo2.TiendaTech;

public class IntermedioBuilder extends Builder {

  public IntermedioBuilder(Catalogo catalogo) {
    super(catalogo);
  }

  @Override
  public void construirProcesador() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Procesador Intermedio"));
  }

  @Override
  public void construirMemoria() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("16 GB"));
  }

  @Override
  public void construirDisco() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
  }

  @Override
  public void construirTarjetaGrafica() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("GTX 1650"));
  }

  @Override
  public void construirGabinete() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Gabinete Intermedio"));
  }

  @Override
  public void construirFuente() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Fuente 800 W"));
  }

}
