package ar.edu.unlp.info.oo2.TiendaTech;

public abstract class Builder {
  protected Presupuesto presupuesto;
  protected Catalogo catalogo;

  public Builder(Catalogo catalogo) {
    this.presupuesto = new Presupuesto("");
    this.catalogo = catalogo;
  }

  public void reset(String nombreDelSolicitante) {
    this.presupuesto = new Presupuesto(nombreDelSolicitante);
  }

  public Presupuesto build() {
    Presupuesto presupuesto = this.presupuesto;
    return presupuesto;
  }

  public abstract void construirProcesador();

  public abstract void construirMemoria();

  public abstract void construirDisco();

  public void construirTarjetaGrafica() {
    this.presupuesto.getConfiguracion()
        .agregarComponente(new Componente("Tarjeta Integrada", "Tarjeta Integrada", 0, 0));
  }

  public abstract void construirGabinete();

  public void construirFuente() {
    this.presupuesto.getConfiguracion().agregarComponente(new Componente("Fuente Integrada", "Fuente Integrada", 0, 0));
  }

}
