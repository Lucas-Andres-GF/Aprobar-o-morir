package ar.edu.unlp.info.oo2.TiendaTech;

public class GameBuilder extends Builder {

  public GameBuilder(Catalogo catalogo) {
    super(catalogo);
  }

  @Override
  public void construirProcesador() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Procesador Gamer"));
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Pad termico"));
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Cooler"));
  }

  @Override
  public void construirMemoria() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("32 GB"));
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("32 GB"));
  }

  @Override
  public void construirDisco() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("SSD 1 TB"));
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
  }

  @Override
  public void construirTarjetaGrafica() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("RTX 4090"));
  }

  @Override
  public void construirGabinete() {
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente("Gabinete Gamer"));
  }

  @Override
  public void construirFuente() {
    double consumo = this.presupuesto.getConfiguracion().getConsumo();
    double potencia = consumo + (consumo * 0.5);
    String descripcionFuente = "Fuente " + potencia + " W";
    this.presupuesto.getConfiguracion().agregarComponente(this.catalogo.getComponente(descripcionFuente));
  }
}
