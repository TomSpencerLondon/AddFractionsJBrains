package math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AddFractionsTest {
  @ParameterizedTest
  @CsvSource({
      "0, 0, 0",
      "0, 5, 5",
      "3, 4, 7",
      "-3, 1, -2"
  })
  void adds_integers(int first, int second, int result) {
    assertEquals(
        new Fraction(first).plus(new Fraction(second)),
        new Fraction(result)
    );
  }

  @Test
  void non_trivial_denominator() {
    Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
    assertEquals(sum, new Fraction(3, 5));
  }

  @Test
  void different_numerators() {
    assertNotEquals(new Fraction(1, 5), new Fraction(2, 5));
  }

  @Test
  void different_denominators() {
    assertNotEquals(new Fraction(3, 4), new Fraction(3, 7));

  }
}
