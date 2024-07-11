package ar.edu.unlp.info.oo2.TiendaTech;

public class Director {

  public Presupuesto construirPresupuesto(Builder builder, String nombreDelSolicitante) {
    builder.reset(nombreDelSolicitante);
    builder.construirProcesador();
    builder.construirMemoria();
    builder.construirDisco();
    builder.construirTarjetaGrafica();
    builder.construirGabinete();
    builder.construirFuente();
    return builder.build();
  }

  public Presupuesto construirPresupuesto2(Builder builder, String nombreDelSolicitante) {
    builder.reset(nombreDelSolicitante);
    builder.construirMemoria();
    builder.construirProcesador();
    builder.construirDisco();
    builder.construirGabinete();
    builder.construirFuente();
    return builder.build();
  }

}
