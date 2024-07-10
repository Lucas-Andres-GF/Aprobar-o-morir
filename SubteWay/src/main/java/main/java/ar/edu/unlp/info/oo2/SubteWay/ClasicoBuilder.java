package main.java.ar.edu.unlp.info.oo2.SubteWay;

/**
 * ClasicoBuilder
 */
public class ClasicoBuilder extends Builder {

  
  @Override
  public void setPan() {
    this.sandwich.setPan(new Componente("pan", 100));
  }

  @Override
  public void setAderezo() {
    this.sandwich.setAderezo(new Componente("mayonesa", 20));
  }

  @Override
  public void setPrincipal() {
    this.sandwich.setPrincipal(new Componente("carne de ternera", 300));
  }

  @Override
  public void setAdicional() {
    this.sandwich.setAdicional(new Componente("tomate", 80));
  }

}