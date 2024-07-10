package main.java.ar.edu.unlp.info.oo2.SubteWay;

public class SinTaccBuilder extends Builder {

  @Override
  public void setPan() {
    this.sandwich.setPan(new Componente("pan de chipa", 150));
  }

  @Override
  public void setAderezo() {
    this.sandwich.setAderezo(new Componente("salsa tartara", 18));
  }

  @Override
  public void setPrincipal() {
    this.sandwich.setPrincipal(new Componente("pollo", 250));
  }

  @Override
  public void setAdicional() {
    this.sandwich.setAdicional(new Componente("verdura grillada", 200));
  }

}
