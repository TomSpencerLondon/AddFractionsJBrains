package math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
