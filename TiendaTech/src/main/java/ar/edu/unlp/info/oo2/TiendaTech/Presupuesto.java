package ar.edu.unlp.info.oo2.TiendaTech;

public class Presupuesto {
  private Configuracion configuracion;
  private String nombreDelSolicitante;

  public Presupuesto(String nombreDelSolicitante) {
    this.configuracion = new Configuracion();
    this.nombreDelSolicitante = nombreDelSolicitante;
  }

  public Configuracion getConfiguracion() {
    return configuracion;
  }

  public String toString() {
    return "Presupuesto para " + this.nombreDelSolicitante + ":\n" + this.configuracion.toString();
  }

}
