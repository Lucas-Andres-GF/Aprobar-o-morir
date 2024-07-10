package main.java.ar.edu.unlp.info.oo2.SubteWay;

public class Client {

  private Builder builder;

  public Client() {
    this.builder = new ClasicoBuilder();
  }

  public void setBuilder(Builder builder) {
    this.builder = builder;
  }

  public Sandwich makeSandwich() {
    this.builder.reset();
    this.builder.setPan();
    this.builder.setAderezo();
    this.builder.setPrincipal();
    this.builder.setAdicional();
    return this.builder.getSandwich();
  }

}
