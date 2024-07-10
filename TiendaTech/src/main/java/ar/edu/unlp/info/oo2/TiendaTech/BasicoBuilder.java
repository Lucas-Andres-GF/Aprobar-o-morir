package ar.edu.unlp.info.oo2.TiendaTech;

public class BasicoBuilder extends Builder {

  public BasicoBuilder(Catalogo catalogo) {
    super(catalogo);
  }

  @Override
  public void construirProcesador() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Procesador Basico"));
  }

  @Override
  public void construirMemoria() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("8 GB"));
  }

  @Override
  public void construirDisco() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("HDD 500 GB"));
  }

  @Override
  public void construirGabinete() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Gabinete Estandar"));
  }

}
