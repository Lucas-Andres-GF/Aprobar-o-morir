package main.java.ar.edu.unlp.info.oo2.SubteWay;

public abstract class Builder {

  protected Sandwich sandwich;

  public void reset() {
    this.sandwich = new Sandwich();
  }

  public abstract void setPan();

  public abstract void setAderezo();

  public abstract void setPrincipal();

  public abstract void setAdicional();

  public Sandwich getSandwich() {
    return this.sandwich;
  }

}
