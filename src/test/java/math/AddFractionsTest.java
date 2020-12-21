package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionsTest {
  @Test
  void zero_plus_zero() {
    Fraction plus = new Fraction(0).plus(new Fraction(0));
    assertEquals(plus, new Fraction(0));
  }

  @Test
  void zero_plus_non_zero() {
    Fraction plus = new Fraction(0).plus(new Fraction(5));
    assertEquals(plus, new Fraction(5));
  }
}
