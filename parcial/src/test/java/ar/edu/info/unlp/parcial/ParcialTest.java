package ar.edu.info.unlp.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class ParcialTest {
  Banco banco;

  @BeforeEach
  public void setUp() {
    banco = new Banco(0.5);
  }

  @Test
  public void testSolicitarPrestamoAceptado() {
    banco.solicitarPrestamoSimple("Lucas", 5000, 100, 10);
    
  }

}
