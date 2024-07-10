package main.java.ar.edu.unlp.info.oo2.SubteWay;

public class VeganoBuilder extends Builder {

  @Override
  public void setPan() {
    this.sandwich.setPan(new Componente("pan integral", 100));
  }

  @Override
  public void setAderezo() {
    this.sandwich.setAderezo(new Componente("salsa criolla", 20));
  }

  @Override
  public void setPrincipal() {
    this.sandwich.setPrincipal(new Componente("milanesa de girgolas", 500));
  }

  @Override
  public void setAdicional() {
    this.sandwich.setAdicional(new Componente("sin adicional", 0));
  }

}
