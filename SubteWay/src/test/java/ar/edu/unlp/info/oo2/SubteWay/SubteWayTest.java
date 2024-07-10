package ar.edu.unlp.info.oo2.SubteWay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.ar.edu.unlp.info.oo2.SubteWay.Client;
import main.java.ar.edu.unlp.info.oo2.SubteWay.Sandwich;
import main.java.ar.edu.unlp.info.oo2.SubteWay.VeganoBuilder;

public class SubteWayTest {

  Client subteWay;
  Sandwich sandwich;

  @BeforeEach
  public void setUp() throws Exception {
    subteWay = new Client();
  }

  // Test case: testClasico
  @Test
  public void testClasico() {
    VeganoBuilder builder = new VeganoBuilder();
    subteWay.setBuilder(builder);
    sandwich = subteWay.makeSandwich();

    System.out.println(sandwich.getDescripcion());
    System.out.println(sandwich.getPrecio());
  }

}
