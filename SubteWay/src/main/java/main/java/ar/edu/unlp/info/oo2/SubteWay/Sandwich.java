package main.java.ar.edu.unlp.info.oo2.SubteWay;

public class Sandwich {

  private Componente pan;
  private Componente principal;
  private Componente aderezo;
  private Componente adicional;

  public void setPan(Componente pan) {
    this.pan = pan;
  }

  public void setPrincipal(Componente principal) {
    this.principal = principal;
  }

  public void setAderezo(Componente aderezo) {
    this.aderezo = aderezo;
  }

  public void setAdicional(Componente adicional) {
    this.adicional = adicional;
  }

  public double getPrecio() {
    return this.pan.getPrecio() + this.principal.getPrecio() + this.aderezo.getPrecio() + this.adicional.getPrecio();
  }

  public String getDescripcion() {
    return "Sandwich de " + this.pan.getNombre() + " con " + this.principal.getNombre() + ", "
        + this.aderezo.getNombre() + " y " + this.adicional.getNombre();
  }

}
