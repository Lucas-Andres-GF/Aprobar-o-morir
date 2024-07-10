package main.java.ar.edu.unlp.info.oo2.SubteWay;

public class VegetarianoBuilder extends Builder {

  @Override
  public void setPan() {
    this.sandwich.setPan(new Componente("pan con semillas", 120));
  }

  @Override
  public void setAderezo() {
    this.sandwich.setAderezo(new Componente("sin aderezo", 0));
  }

  @Override
  public void setPrincipal() {
    this.sandwich.setPrincipal(new Componente("provoleta grillada", 200));
  }

  @Override
  public void setAdicional() {
    this.sandwich.setAdicional(new Componente("berenjenas al escabeche", 100));
  }

}
