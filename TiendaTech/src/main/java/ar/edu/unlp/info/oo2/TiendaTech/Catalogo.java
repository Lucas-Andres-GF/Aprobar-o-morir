package ar.edu.unlp.info.oo2.TiendaTech;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
  private List<Componente> componentes;

  public Catalogo() {
    this.componentes = new ArrayList<Componente>();
  }

  public void agregarComponente(Componente componente) {
    System.out.println("Componente agregado: " + componente.getDescripcion());
    this.componentes.add(componente);
  }

  public Componente getComponente(String descripcion) {
    System.out.println("Componente solicitado: " + descripcion);
    return this.componentes.stream().filter(c -> c.getDescripcion().equals(descripcion)).findFirst().orElse(null);
  }

}
