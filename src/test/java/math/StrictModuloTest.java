package math;

import org.junit.jupiter.api.Test;

import static math.StrictModulo.remainder;
import static math.StrictModulo.strictModulo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrictModuloTest {
  @Test
  void minus_number_with_positive_returns_positive_modulo() {
    int number = strictModulo(-23, 4);

    assertEquals(number, 1);
  }

  @Test
  void remainder_gives_negative_answer() {
    int number = remainder(-23, 4);
    assertEquals(number, -3);
  }
}
