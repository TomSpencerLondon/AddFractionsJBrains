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

  @Test
  void whole_number_not_equal_to_different_whole_number() {
    assertNotEquals(new Fraction(6), new Fraction(5));
  }

  @Test
  void non_negative_non_zero_operands() {
    assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
  }

  @Test
  void negative_inputs_and_negative_output() {
    assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
  }

  @Test
  void non_trivial_but_common_denominitator() {
    Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
    assertEquals(new Fraction(3, 5), sum);
  }

  @Test
  void cross_addition_returns_unreduced_fraction() {
    Fraction sum = new Fraction(1, 2).plus(new Fraction(1, 4));

    assertEquals(new Fraction(6, 8), sum);
  }
}
