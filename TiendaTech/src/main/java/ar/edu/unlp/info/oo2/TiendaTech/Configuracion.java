package ar.edu.unlp.info.oo2.TiendaTech;

import java.util.ArrayList;
import java.util.List;

public class Configuracion {
  private List<Componente> componentes;

  public Configuracion() {
    this.componentes = new ArrayList<Componente>();
  }

  public void agregarComponente(Componente componente) {
    this.componentes.add(componente);
  }

  public double getConsumo() {
    return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
  }

  public double getPrecio() {
    return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
  }

  public String toString() {
    String resultado = "Precio total: " + this.getPrecio() + "\nConsumo total: " + this.getConsumo() + "\n";
    return this.componentes.stream().map(c -> c.getDescripcion()).reduce(resultado, (acc, desc) -> acc + desc + "\n");
  }

}
